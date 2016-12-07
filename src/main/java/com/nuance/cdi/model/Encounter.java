package com.nuance.cdi.model;

public class Encounter {
	private int encounterMainSid;
	private String accountNum;
	private String mrn;
	private Name name;

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getMrn() {
		return mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getEncounterMainSid() {
		return encounterMainSid;
	}

	public void setEncounterMainSid(int encounterMainSid) {
		this.encounterMainSid = encounterMainSid;
	}

}
