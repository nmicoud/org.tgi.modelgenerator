package org.tgi.model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;

/**
 *  Generate Model Template
 *  @author Nico
 *  @version $Id: MTGIModelGeneratorTemplate.java
 */
public class MTGIModelGeneratorTemplate extends X_TGI_ModelGeneratorTemplate
{
	private static final long serialVersionUID = -2556373628322775711L;

	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param TGI_ModelGeneratorTemplate_ID id
	 *	@param trxName transaction
	 */
	public MTGIModelGeneratorTemplate (Properties ctx, int TGI_ModelGeneratorTemplate_ID, String trxName)
	{
		super (ctx, TGI_ModelGeneratorTemplate_ID, trxName);
	}	// MTGIModelGeneratorTemplate

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MTGIModelGeneratorTemplate (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	// MTGIModelGeneratorTemplate

	public static List<MTGIModelGeneratorTemplate> get(Properties ctx, String type, String trxName) {
		List<MTGIModelGeneratorTemplate> list = new Query(ctx, Table_Name, "IsIntersectCSV(Type, ?)= 'Y'", trxName)
				.setOnlyActiveRecords(true)
				.setParameters(type)
				.setOrderBy("Name")
				.list();

		return list;
	}

}	// MTGIModelGeneratorTemplate