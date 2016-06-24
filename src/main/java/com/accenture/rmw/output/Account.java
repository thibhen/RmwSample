package com.accenture.rmw.output;

import com.liferay.portal.kernel.json.JSON;

@JSON
public class Account {
	

		public Long id ;

		public String title;

		public float balance;

		public Account(Long id, String title, float balance) {
			super();
			this.id = id;
			this.title = title;
			this.balance = balance;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public float getBalance() {
			return balance;
		}

		public void setBalance(float balance) {
			this.balance = balance;
		}


}
