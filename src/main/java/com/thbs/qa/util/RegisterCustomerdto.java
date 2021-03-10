package com.thbs.qa.util;

import java.util.ArrayList;
import java.util.List;

public class RegisterCustomerdto {
	String msisdn;
	String firstName;
	String lastName;
	String gender;
	String nid;
	int age;
	String lang;
	int offerId;
	int offerCoverId;
	int beneficiaryId;
	String benFirstName;
	String benLastName;
	int benAge;
	String benGender;
	String benRelation;
	String benNid;
	
	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public int getOfferCoverId() {
		return offerCoverId;
	}
	public void setOfferCoverId(int offerCoverId) {
		this.offerCoverId = offerCoverId;
	}
	public int getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String getBenFirstName() {
		return benFirstName;
	}
	public void setBenFirstName(String benFirstName) {
		this.benFirstName = benFirstName;
	}
	public String getBenLastName() {
		return benLastName;
	}
	public void setBenLastName(String benLastName) {
		this.benLastName = benLastName;
	}
	public int getBenAge() {
		return benAge;
	}
	public void setBenAge(int benAge) {
		this.benAge = benAge;
	}
	public String getBenGender() {
		return benGender;
	}
	public void setBenGender(String benGender) {
		this.benGender = benGender;
	}
	public String getBenRelation() {
		return benRelation;
	}
	public void setBenRelation(String benRelation) {
		this.benRelation = benRelation;
	}
	public String getBenNid() {
		return benNid;
	}
	public void setBenNid(String benNid) {
		this.benNid = benNid;
	}
	
	public void getCustomerData()
	{
		List<String> cusInfoList=new ArrayList<String>();
		RegisterCustomerdto regcustomerdto =new RegisterCustomerdto();
		regcustomerdto.setMsisdn("070023786");
		cusInfoList.add(regcustomerdto.getMsisdn());
		
	}
	
	
	
	
	
	
	

}
