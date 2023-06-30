package org.tgi.model;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

public class TgiModelGeneratorModelFactory implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {

		if (tableName.equals(MTGIModelGeneratorTemplate.Table_Name))
			return MTGIModelGeneratorTemplate.class;

		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {

		if (tableName.equals(MTGIModelGeneratorTemplate.Table_Name))
			return new MTGIModelGeneratorTemplate(Env.getCtx(), Record_ID, trxName);

		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {

		if (tableName.equals(MTGIModelGeneratorTemplate.Table_Name))
			return new MTGIModelGeneratorTemplate(Env.getCtx(), rs, trxName);

		return null;
	}
}
