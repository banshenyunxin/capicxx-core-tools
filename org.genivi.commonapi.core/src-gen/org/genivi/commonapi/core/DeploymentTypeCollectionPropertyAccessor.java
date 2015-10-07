/*******************************************************************************
* This file has been generated by Franca's FDeployGenerator.
* Source: deployment spec 'org.genivi.commonapi.core.deployment'
*******************************************************************************/
package org.genivi.commonapi.core;

import org.franca.core.franca.FInterface;
import org.franca.core.franca.FEnumerationType;
import org.franca.deploymodel.core.FDeployedTypeCollection;

/**
 * Accessor for deployment properties for 'org.genivi.commonapi.core.deployment' specification
 */		
public class DeploymentTypeCollectionPropertyAccessor
{
	
	private FDeployedTypeCollection target;

	public DeploymentTypeCollectionPropertyAccessor (FDeployedTypeCollection target) {
		this.target = target;
	}
	
	public enum DefaultEnumBackingType {
		UInt8, UInt16, UInt32, UInt64, Int8, Int16, Int32, Int64
	}
	public DefaultEnumBackingType getDefaultEnumBackingType (FInterface obj) {
		String e = target.getEnum(obj, "DefaultEnumBackingType");
		if (e==null) return null;
		return convertDefaultEnumBackingType(e);
	}
	private DefaultEnumBackingType convertDefaultEnumBackingType (String val) {
		if (val.equals("UInt8"))
			return DefaultEnumBackingType.UInt8; else 
		if (val.equals("UInt16"))
			return DefaultEnumBackingType.UInt16; else 
		if (val.equals("UInt32"))
			return DefaultEnumBackingType.UInt32; else 
		if (val.equals("UInt64"))
			return DefaultEnumBackingType.UInt64; else 
		if (val.equals("Int8"))
			return DefaultEnumBackingType.Int8; else 
		if (val.equals("Int16"))
			return DefaultEnumBackingType.Int16; else 
		if (val.equals("Int32"))
			return DefaultEnumBackingType.Int32; else 
		if (val.equals("Int64"))
			return DefaultEnumBackingType.Int64;
		return null;
	}
	
	public enum EnumBackingType {
		UInt8, UInt16, UInt32, UInt64, Int8, Int16, Int32, Int64
	}
	public EnumBackingType getEnumBackingType (FEnumerationType obj) {
		String e = target.getEnum(obj, "EnumBackingType");
		if (e==null) return null;
		return convertEnumBackingType(e);
	}
	private EnumBackingType convertEnumBackingType (String val) {
		if (val.equals("UInt8"))
			return EnumBackingType.UInt8; else 
		if (val.equals("UInt16"))
			return EnumBackingType.UInt16; else 
		if (val.equals("UInt32"))
			return EnumBackingType.UInt32; else 
		if (val.equals("UInt64"))
			return EnumBackingType.UInt64; else 
		if (val.equals("Int8"))
			return EnumBackingType.Int8; else 
		if (val.equals("Int16"))
			return EnumBackingType.Int16; else 
		if (val.equals("Int32"))
			return EnumBackingType.Int32; else 
		if (val.equals("Int64"))
			return EnumBackingType.Int64;
		return null;
	}
	
	
}