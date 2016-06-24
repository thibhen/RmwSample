package com.accenture.rmw.output;

import java.util.ArrayList;

import com.liferay.portal.kernel.json.JSON;


@JSON
public class AccountList {

	
	@JSON
	private ArrayList<Account> accountlist = new ArrayList<Account>();

	public ArrayList<Account> getAccountlist() {
		return accountlist;
	}

	public void setAccountlist(ArrayList<Account> accountlist) {
		this.accountlist = accountlist;
	}
	
	
	
}
