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
package org.tgi.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for TGI_ModelGeneratorTemplate
 *  @author iDempiere (generated) 
 *  @version Release 10
 */
@SuppressWarnings("all")
public interface I_TGI_ModelGeneratorTemplate 
{

    /** TableName=TGI_ModelGeneratorTemplate */
    public static final String Table_Name = "TGI_ModelGeneratorTemplate";

    /** AD_Table_ID=1000878 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 4 - System 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Folder */
    public static final String COLUMNNAME_Folder = "Folder";

	/** Set Folder.
	  * A folder on a local or remote system to store data into
	  */
	public void setFolder (String Folder);

	/** Get Folder.
	  * A folder on a local or remote system to store data into
	  */
	public String getFolder();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name TableName */
    public static final String COLUMNNAME_TableName = "TableName";

	/** Set DB Table Name.
	  * Name of the table in the database
	  */
	public void setTableName (String TableName);

	/** Get DB Table Name.
	  * Name of the table in the database
	  */
	public String getTableName();

    /** Column name TGI_ColumnEntityType */
    public static final String COLUMNNAME_TGI_ColumnEntityType = "TGI_ColumnEntityType";

	/** Set Column Entity Type	  */
	public void setTGI_ColumnEntityType (String TGI_ColumnEntityType);

	/** Get Column Entity Type	  */
	public String getTGI_ColumnEntityType();

    /** Column name TGI_ModelGeneratorTemplate_ID */
    public static final String COLUMNNAME_TGI_ModelGeneratorTemplate_ID = "TGI_ModelGeneratorTemplate_ID";

	/** Set Model Generator Template	  */
	public void setTGI_ModelGeneratorTemplate_ID (int TGI_ModelGeneratorTemplate_ID);

	/** Get Model Generator Template	  */
	public int getTGI_ModelGeneratorTemplate_ID();

    /** Column name TGI_ModelGeneratorTemplate_UU */
    public static final String COLUMNNAME_TGI_ModelGeneratorTemplate_UU = "TGI_ModelGeneratorTemplate_UU";

	/** Set TGI_ModelGeneratorTemplate_UU	  */
	public void setTGI_ModelGeneratorTemplate_UU (String TGI_ModelGeneratorTemplate_UU);

	/** Get TGI_ModelGeneratorTemplate_UU	  */
	public String getTGI_ModelGeneratorTemplate_UU();

    /** Column name TGI_PackageName */
    public static final String COLUMNNAME_TGI_PackageName = "TGI_PackageName";

	/** Set Package Name	  */
	public void setTGI_PackageName (String TGI_PackageName);

	/** Get Package Name	  */
	public String getTGI_PackageName();

    /** Column name TGI_TableEntityType */
    public static final String COLUMNNAME_TGI_TableEntityType = "TGI_TableEntityType";

	/** Set Table Entity Type	  */
	public void setTGI_TableEntityType (String TGI_TableEntityType);

	/** Get Table Entity Type	  */
	public String getTGI_TableEntityType();

    /** Column name Type */
    public static final String COLUMNNAME_Type = "Type";

	/** Set Type.
	  * Type of Validation (SQL, Java Script, Java Language)
	  */
	public void setType (String Type);

	/** Get Type.
	  * Type of Validation (SQL, Java Script, Java Language)
	  */
	public String getType();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
