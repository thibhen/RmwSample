package com.accenture.rmw.output;

public class Transaction {

	
	public String datePosted  ;

	public String description;

	public String amount;
	
	public int transactionType;

	public Transaction(String datePosted, String description, String amount, int transactionType) {
		super();
		this.datePosted = datePosted;
		this.description = description;
		this.amount = amount;
		this.transactionType = transactionType;
	}

	public String getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public int getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(int transactionType) {
		this.transactionType = transactionType;
	} 
}
