/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.tgi.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for TGI_ModelGeneratorTemplate
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="TGI_ModelGeneratorTemplate")
public class X_TGI_ModelGeneratorTemplate extends PO implements I_TGI_ModelGeneratorTemplate, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230630L;

    /** Standard Constructor */
    public X_TGI_ModelGeneratorTemplate (Properties ctx, int TGI_ModelGeneratorTemplate_ID, String trxName)
    {
      super (ctx, TGI_ModelGeneratorTemplate_ID, trxName);
      /** if (TGI_ModelGeneratorTemplate_ID == 0)
        {
			setName (null);
			setTGI_ModelGeneratorTemplate_ID (0);
			setType (null);
// 1,2
        } */
    }

    /** Standard Constructor */
    public X_TGI_ModelGeneratorTemplate (Properties ctx, int TGI_ModelGeneratorTemplate_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, TGI_ModelGeneratorTemplate_ID, trxName, virtualColumns);
      /** if (TGI_ModelGeneratorTemplate_ID == 0)
        {
			setName (null);
			setTGI_ModelGeneratorTemplate_ID (0);
			setType (null);
// 1,2
        } */
    }

    /** Load Constructor */
    public X_TGI_ModelGeneratorTemplate (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_TGI_ModelGeneratorTemplate[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Folder.
		@param Folder A folder on a local or remote system to store data into
	*/
	public void setFolder (String Folder)
	{
		set_Value (COLUMNNAME_Folder, Folder);
	}

	/** Get Folder.
		@return A folder on a local or remote system to store data into
	  */
	public String getFolder()
	{
		return (String)get_Value(COLUMNNAME_Folder);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set DB Table Name.
		@param TableName Name of the table in the database
	*/
	public void setTableName (String TableName)
	{
		set_Value (COLUMNNAME_TableName, TableName);
	}

	/** Get DB Table Name.
		@return Name of the table in the database
	  */
	public String getTableName()
	{
		return (String)get_Value(COLUMNNAME_TableName);
	}

	/** Set Column Entity Type.
		@param TGI_ColumnEntityType Column Entity Type
	*/
	public void setTGI_ColumnEntityType (String TGI_ColumnEntityType)
	{
		set_Value (COLUMNNAME_TGI_ColumnEntityType, TGI_ColumnEntityType);
	}

	/** Get Column Entity Type.
		@return Column Entity Type	  */
	public String getTGI_ColumnEntityType()
	{
		return (String)get_Value(COLUMNNAME_TGI_ColumnEntityType);
	}

	/** Set Model Generator Template.
		@param TGI_ModelGeneratorTemplate_ID Model Generator Template
	*/
	public void setTGI_ModelGeneratorTemplate_ID (int TGI_ModelGeneratorTemplate_ID)
	{
		if (TGI_ModelGeneratorTemplate_ID < 1)
			set_ValueNoCheck (COLUMNNAME_TGI_ModelGeneratorTemplate_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_TGI_ModelGeneratorTemplate_ID, Integer.valueOf(TGI_ModelGeneratorTemplate_ID));
	}

	/** Get Model Generator Template.
		@return Model Generator Template	  */
	public int getTGI_ModelGeneratorTemplate_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TGI_ModelGeneratorTemplate_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TGI_ModelGeneratorTemplate_UU.
		@param TGI_ModelGeneratorTemplate_UU TGI_ModelGeneratorTemplate_UU
	*/
	public void setTGI_ModelGeneratorTemplate_UU (String TGI_ModelGeneratorTemplate_UU)
	{
		set_Value (COLUMNNAME_TGI_ModelGeneratorTemplate_UU, TGI_ModelGeneratorTemplate_UU);
	}

	/** Get TGI_ModelGeneratorTemplate_UU.
		@return TGI_ModelGeneratorTemplate_UU	  */
	public String getTGI_ModelGeneratorTemplate_UU()
	{
		return (String)get_Value(COLUMNNAME_TGI_ModelGeneratorTemplate_UU);
	}

	/** Set Package Name.
		@param TGI_PackageName Package Name
	*/
	public void setTGI_PackageName (String TGI_PackageName)
	{
		set_Value (COLUMNNAME_TGI_PackageName, TGI_PackageName);
	}

	/** Get Package Name.
		@return Package Name	  */
	public String getTGI_PackageName()
	{
		return (String)get_Value(COLUMNNAME_TGI_PackageName);
	}

	/** Set Table Entity Type.
		@param TGI_TableEntityType Table Entity Type
	*/
	public void setTGI_TableEntityType (String TGI_TableEntityType)
	{
		set_Value (COLUMNNAME_TGI_TableEntityType, TGI_TableEntityType);
	}

	/** Get Table Entity Type.
		@return Table Entity Type	  */
	public String getTGI_TableEntityType()
	{
		return (String)get_Value(COLUMNNAME_TGI_TableEntityType);
	}

	/** Table = 1 */
	public static final String TYPE_Table = "1";
	/** Menu = 2 */
	public static final String TYPE_Menu = "2";
	/** Set Type.
		@param Type Type of Validation (SQL, Java Script, Java Language)
	*/
	public void setType (String Type)
	{

		set_Value (COLUMNNAME_Type, Type);
	}

	/** Get Type.
		@return Type of Validation (SQL, Java Script, Java Language)
	  */
	public String getType()
	{
		return (String)get_Value(COLUMNNAME_Type);
	}
}