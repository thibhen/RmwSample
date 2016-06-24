package com.accenture.rmw.output;

import java.util.ArrayList;

import com.liferay.portal.kernel.json.JSON;

@JSON
public class TransactionList {

	
	@JSON
	private ArrayList<Transaction> transactionlist = new ArrayList<Transaction>();

	String accountname;

	public TransactionList(String accountname) {
		this.accountname = accountname;
	}

	public ArrayList<Transaction> getTransactionlist() {
		return transactionlist;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	
	
	
}
