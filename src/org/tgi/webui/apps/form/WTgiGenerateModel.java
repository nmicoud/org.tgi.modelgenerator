package org.tgi.webui.apps.form;

import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.adempiere.util.ModelClassGenerator;
import org.adempiere.util.ModelInterfaceGenerator;
import org.adempiere.webui.component.Borderlayout;
import org.adempiere.webui.component.ConfirmPanel;
import org.adempiere.webui.component.Label;
import org.adempiere.webui.component.Listbox;
import org.adempiere.webui.editor.WStringEditor;
import org.adempiere.webui.panel.ADForm;
import org.adempiere.webui.util.ZKUpdateUtil;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Util;
import org.tgi.model.MTGIModelGeneratorTemplate;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Center;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.North;
import org.zkoss.zul.South;
import org.zkoss.zul.Vlayout;

/**
 * Panel that allow to generate model within iDempiere (from Menu or from a table)
 * @author nmicoud, TGI
 */

public class WTgiGenerateModel extends ADForm implements EventListener<Event> {

	private static final long serialVersionUID = -4769866169297363321L;

	public static final CLogger log = CLogger.getCLogger(WTgiGenerateModel.class);
	private Properties m_ctx = null;
	private Listbox fTemplate;
	private Borderlayout mainLayout;
	private ConfirmPanel confirmPanel;
	private WStringEditor fSourceFolder, fPackageName, fEntityType, fTableName, fColumnEntityType;

	protected void initForm() {
		m_ctx = Env.getCtx();

		try {
			init();

			if (getGridTab() != null) {
				ZKUpdateUtil.setHeight(this, "280px");
				ZKUpdateUtil.setWidth(this, "400px");
				setMaximizable(true);
				setClosable(true);
				setSizable(true);
				setBorder(true);
			}

			if (fTemplate.getItemCount() == 2) {
				fTemplate.setSelectedIndex(1);
				onTemplateChange();
			}
		}
		catch (Exception ex) {
			throw new AdempiereException("WTgiGenerateModel.initForm" + ex);
		}
	}

	private void init() {

		fTemplate = new Listbox();
		fTemplate.setMold("select");
		fTemplate.setRows(1);
		fTemplate.addEventListener(Events.ON_SELECT, this);
		fTemplate.addItem(new KeyNamePair(-1, ""));

		for (MTGIModelGeneratorTemplate mgt : MTGIModelGeneratorTemplate.get(m_ctx, getFilterType(), null))
			fTemplate.addItem(new KeyNamePair(mgt.getTGI_ModelGeneratorTemplate_ID(), mgt.getName()));

		fSourceFolder = new WStringEditor("", true, false, false, 20, 20, "", "");
		fPackageName = new WStringEditor("", true, false, false, 20, 20, "", "");
		fEntityType = new WStringEditor("", true, false, false, 20, 20, "", ""); // Liste ?
		fTableName = new WStringEditor("", true, false, false, 20, 20, "", "");
		fColumnEntityType = new WStringEditor("", true, false, false, 20, 20, "", "");

		ZKUpdateUtil.setHflex(fSourceFolder.getComponent(), "1");
		ZKUpdateUtil.setHflex(fPackageName.getComponent(), "1");
		ZKUpdateUtil.setHflex(fEntityType.getComponent(), "1");
		ZKUpdateUtil.setHflex(fTableName.getComponent(), "1");
		ZKUpdateUtil.setHflex(fColumnEntityType.getComponent(), "1");

		confirmPanel = new ConfirmPanel(true);
		confirmPanel.addActionListener(this);

		Vlayout vl = new Vlayout();

		mainLayout = new Borderlayout();
		appendChild(mainLayout);

		North north = new North();
		mainLayout.appendChild(north);
		north.appendChild(fTemplate);

		Center center = new Center();
		mainLayout.appendChild(center);
		center.appendChild(vl);

		Hlayout hl = getHlayout();
		hl.appendChild(new Label("Source Folder"));
		hl.appendChild(fSourceFolder.getComponent());
		vl.appendChild(hl);

		hl = getHlayout();
		hl.appendChild(new Label("Package Name"));
		hl.appendChild(fPackageName.getComponent());
		vl.appendChild(hl);

		hl = getHlayout();
		hl.appendChild(new Label("Entity Type"));
		hl.appendChild(fEntityType.getComponent());
		vl.appendChild(hl);

		hl = getHlayout();
		hl.appendChild(new Label("Table Name"));
		hl.appendChild(fTableName.getComponent());
		vl.appendChild(hl);

		hl = getHlayout();
		hl.appendChild(new Label("Column Entity Type"));
		hl.appendChild(fColumnEntityType.getComponent());
		vl.appendChild(hl);

		South south = new South();
		south.setSclass("dialog-footer");
		mainLayout.appendChild(south);
		south.appendChild(confirmPanel);
	}

	public void onEvent(Event event) throws Exception {
		Object source = event.getTarget();

		if (source == confirmPanel.getButton(ConfirmPanel.A_CANCEL))
			detach();
		else if (source == confirmPanel.getButton(ConfirmPanel.A_OK)) {

			String sourceFolder = fSourceFolder.getComponent().getValue();
			String packageName = fPackageName.getComponent().getValue();
			String entityType = fEntityType.getComponent().getValue();
			String tableName = fTableName.getComponent().getValue();
			String columnEntityType = fColumnEntityType.getComponent().getValue();

			ModelInterfaceGenerator.generateSource(sourceFolder, packageName, entityType, tableName, columnEntityType);
			ModelClassGenerator.generateSource(sourceFolder, packageName, entityType, tableName, columnEntityType);

			if (getGridTab() != null)
				detach();
		}
		else if (source == fTemplate) {
			onTemplateChange();
		}
	}

	private void onTemplateChange() {
		Listitem listitem = fTemplate.getSelectedItem();
		if (listitem != null) {

			MTGIModelGeneratorTemplate mgt = new MTGIModelGeneratorTemplate(m_ctx, (Integer) listitem.getValue(), null);

			fSourceFolder.setValue(mgt.getFolder());
			fPackageName.setValue(mgt.getTGI_PackageName());

			String entityType = mgt.getTGI_TableEntityType();
			if (!Util.isEmpty(entityType) && entityType.equals("@EntityType@"))
				entityType = getGridTab().get_ValueAsString("EntityType");

			fEntityType.setValue(entityType);

			String tableName = mgt.getTableName();
			if (!Util.isEmpty(tableName) && tableName.equals("@TableName@"))
				tableName = getGridTab().get_ValueAsString("TableName");

			fTableName.setValue(tableName);

			fColumnEntityType.setValue(mgt.getTGI_ColumnEntityType());
		}
	}

	private String getFilterType() {
		return getGridTab() == null ? MTGIModelGeneratorTemplate.TYPE_Menu : MTGIModelGeneratorTemplate.TYPE_Table;
	}

	public Mode getWindowMode() {
		if (getGridTab() != null)
			return Mode.MODAL;
		return super.getWindowMode();
	}

	private static Hlayout getHlayout() {
		Hlayout layout = new Hlayout();
		layout.setValign("middle");
		return layout;
	}

}
