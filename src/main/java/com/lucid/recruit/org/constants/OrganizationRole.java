package com.lucid.recruit.org.constants;

import java.util.ArrayList;
import java.util.List;

public enum OrganizationRole {
	CLIENT("CLIENT","Client"),
	VENDOR("VENDOR","Vendor"),
	GATEKEEPER("GATEKEEPER","GateKeeper");

	public final String key;
	public final String value;
	OrganizationRole(String key,String value) {
		this.key=key;
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public static List<String> getOrganizationRoles(){
		List<String> orgRoles = new ArrayList<>();
		orgRoles.add(OrganizationRole.GATEKEEPER.getValue());
		orgRoles.add(OrganizationRole.VENDOR.getValue());
		orgRoles.add(OrganizationRole.CLIENT.getValue());
		return orgRoles;
	}

	public static class OrgRole{
		private String key;
		public String value;
	}



}
