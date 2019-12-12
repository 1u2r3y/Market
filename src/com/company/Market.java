package com.company;

public class Market {
	Market[] department;
	String subject,text;
	int dM,dT;

	public Market(String subject, String text, int variants){
		this.subject=subject;
		this.text=text;
		department=new Market[variants];
	}

}
