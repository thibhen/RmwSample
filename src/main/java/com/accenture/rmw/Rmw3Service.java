package com.accenture.rmw;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.accenture.rmw.output.Account;
import com.accenture.rmw.output.AccountList;
import com.accenture.rmw.output.Transaction;
import com.accenture.rmw.output.TransactionList;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.security.ac.AccessControlled;


@AccessControlled
@JSONWebService
public class Rmw3Service {


	private static final Logger LOG = Logger.getLogger( Rmw3Service.class.getName() );

	public Rmw3Service() {
		super();
		LOG.log(Level.INFO, "RmwService starting");
	}

	public java.lang.String getMessage(){
		return "Hello World2!";
	}



	public AccountList getAccounts(){

		
		
		AccountList result = new AccountList();

		for(int i=0;i<5;i++){
			float f = (float)Math.random() * (i+1) * 1000 ;

			result.getAccountlist().add(
					new Account(
							(long)i,
							RandomSentences.getSentence(),
							f));
		}


		return result;
	}


	public TransactionList getMovements(long accountId){

		TransactionList result = new TransactionList("Account " + accountId );

		for(int i=1;i<10;i++){

			GregorianCalendar g = new GregorianCalendar();
			g.roll(GregorianCalendar.DAY_OF_YEAR, i);

			result.getTransactionlist().add(
					new Transaction(
							new SimpleDateFormat("yyyy-MM-dd").format(g.getTime()),
							RandomSentences.getSentence(),
							String.format("%.2f",100*+Math.random()),
							i%2)
					);

		}


		return result;
	}


}
