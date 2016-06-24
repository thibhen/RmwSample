package com.accenture.rmw;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.security.ac.AccessControlled;


@AccessControlled
@JSONWebService
public class RmwService {


	private static final Logger LOG = Logger.getLogger( RmwService.class.getName() );

	public RmwService() {
		super();
		LOG.log(Level.INFO, "RmwService starting");
	}


	public java.lang.String getMessage(){
		return "Hello World!";
	}


	public List<RmwService.Account> getAccounts(){

		ArrayList<RmwService.Account> list = new ArrayList<RmwService.Account>();
		
		for(int i=0;i<5;i++){
			float f = (float)Math.PI * (i+1) * 1000;
			
			list.add(new Account((long)i,RandomSentences.getSentence(),
					f));
		}


		return list;
	}


	public List<RmwService.Movement> getMovements(long accountId){

		ArrayList<RmwService.Movement> list = new ArrayList<RmwService.Movement>();
		 
		for(int i=1;i<10;i++){
			
			GregorianCalendar g = new GregorianCalendar();
			g.roll(GregorianCalendar.DAY_OF_YEAR, i);
			
			list.add(
					new Movement(
							new SimpleDateFormat("yyyy-MM-dd").format(g.getTime()),
							RandomSentences.getSentence(),
							String.format("%.2f",100*+Math.random()),
							i%2)
					);

		}


		return list;
	}





	public final static class Account {

		public Long id ;

		public String title;

		public float balance;

		public Account(Long id, String title, float balance) {
			super();
			this.id = id;
			this.title = title;
			this.balance = balance;
		}

	}


	public final static class Movement {

		public String datePosted  ;

		public String description;

		public String amount;
		
		public int transactionType;

		public Movement(String datePosted, String description, String amount, int transactionType) {
			super();
			this.datePosted = datePosted;
			this.description = description;
			this.amount = amount;
			this.transactionType = transactionType;
		} 

	}

}
