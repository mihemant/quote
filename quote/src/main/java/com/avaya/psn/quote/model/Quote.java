package com.avaya.psn.quote.model;

import java.time.LocalDateTime;

//import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Quote {
	@Id
	int configId;
	String configurationName;
	String dateCreated;
	String sfdcNumber;
	String totalPrice;
	String priceThreashold;
	String status;
	LocalDateTime pricingExpiresDate;
	String eProjectNumber;
	int linkId;
	float maxDiscount;
	String country;
	String theatre;
	float usdPrice;
	float usdListPricee;
	String sfdcOpportunityName;
	String q_currency;
	float q_discount;
	String userinfo_agreementWith;
	String userinfo_generatedByUserName;
	String userinfo_generatedByUserLastName;
	String userinfo_generatedByUserEmail;
	String userinfo_generatedByUserCompany;
	String userinfo_generatedByUserPhone;
	String partnerInfo_companySoldTo;
	String partnerinfo_contactFirstName;
	String partnerInfo_contactLastName;
	String partnerInfo_contactPhone;
	String partnerInfo_contactEmail;
	String partnerInfo_companyName;
	String partnerInfo_companyAddress;
	String partnerInfo_companyCity;
	String partnerInfo_companyState;
	String partnerInfo_companyZip;
	String partnerInfo_companyCountry;
	String partnerInfo_licenceNum;
	String distributorInfo_companySoldTo;
	String distributorInfo_contactFirstName;
	String distributorInfo_contactLastName;
	String distributorInfo_contactPhone;
	String distributorInfo_contactEmail;
	String distributorInfo_companyName;
	String distributorInfo_companyAddress;
	String distributorInfo_companyCity;
	String distributorInfo_companyState;
	String distributorInfo_companyZip;
	String distributorInfo_companyCountry;
	String enduserInfo_companySoldTo;
	String enduserInfo_contactFirstName;
	String enduserInfo_contactLastName;
	String enduserInfo_contactPhone;
	String enduserInfo_contactEmail;
	String enduserInfo_companyName;
	String enduserInfo_companyAddress;
	String enduserInfo_companyCity;
	String enduserInfo_companyState;
	String enduserInfo_companyZip;
	String enduserInfo_companyCountry;
	
	public Quote(int configId,String configurationName,String country) {
		this.configId =configId;
		this.configurationName=configurationName;
		this.country=country;
	}
	
	
	public int getConfigId() {
		return configId;
	}


	public void setConfigId(int configId) {
		this.configId = configId;
	}


	public String getConfigurationName() {
		return configurationName;
	}
	public void setConfigurationName(String configurationName) {
		this.configurationName = configurationName;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getSfdcNumber() {
		return sfdcNumber;
	}
	public void setSfdcNumber(String sfdcNumber) {
		this.sfdcNumber = sfdcNumber;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getPriceThreashold() {
		return priceThreashold;
	}
	public void setPriceThreashold(String priceThreashold) {
		this.priceThreashold = priceThreashold;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getPricingExpiresDate() {
		return pricingExpiresDate;
	}
	public void setPricingExpiresDate(LocalDateTime pricingExpiresDate) {
		this.pricingExpiresDate = pricingExpiresDate;
	}
	public String geteProjectNumber() {
		return eProjectNumber;
	}
	public void seteProjectNumber(String eProjectNumber) {
		this.eProjectNumber = eProjectNumber;
	}
	public int getLinkId() {
		return linkId;
	}
	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}
	public float getMaxDiscount() {
		return maxDiscount;
	}
	public void setMaxDiscount(float maxDiscount) {
		this.maxDiscount = maxDiscount;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getTheatre() {
		return theatre;
	}
	public void setTheatre(String theatre) {
		this.theatre = theatre;
	}
	public float getUsdPrice() {
		return usdPrice;
	}
	public void setUsdPrice(float usdPrice) {
		this.usdPrice = usdPrice;
	}
	public float getUsdListPricee() {
		return usdListPricee;
	}
	public void setUsdListPricee(float usdListPricee) {
		this.usdListPricee = usdListPricee;
	}
	public String getSfdcOpportunityName() {
		return sfdcOpportunityName;
	}
	public void setSfdcOpportunityName(String sfdcOpportunityName) {
		this.sfdcOpportunityName = sfdcOpportunityName;
	}
	public String getQ_currency() {
		return q_currency;
	}
	public void setQ_currency(String q_currency) {
		this.q_currency = q_currency;
	}
	public float getQ_discount() {
		return q_discount;
	}
	public void setQ_discount(float q_discount) {
		this.q_discount = q_discount;
	}
	public String getUserinfo_agreementWith() {
		return userinfo_agreementWith;
	}
	public void setUserinfo_agreementWith(String userinfo_agreementWith) {
		this.userinfo_agreementWith = userinfo_agreementWith;
	}
	public String getUserinfo_generatedByUserName() {
		return userinfo_generatedByUserName;
	}
	public void setUserinfo_generatedByUserName(String userinfo_generatedByUserName) {
		this.userinfo_generatedByUserName = userinfo_generatedByUserName;
	}
	public String getUserinfo_generatedByUserLastName() {
		return userinfo_generatedByUserLastName;
	}
	public void setUserinfo_generatedByUserLastName(String userinfo_generatedByUserLastName) {
		this.userinfo_generatedByUserLastName = userinfo_generatedByUserLastName;
	}
	public String getUserinfo_generatedByUserEmail() {
		return userinfo_generatedByUserEmail;
	}
	public void setUserinfo_generatedByUserEmail(String userinfo_generatedByUserEmail) {
		this.userinfo_generatedByUserEmail = userinfo_generatedByUserEmail;
	}
	public String getUserinfo_generatedByUserCompany() {
		return userinfo_generatedByUserCompany;
	}
	public void setUserinfo_generatedByUserCompany(String userinfo_generatedByUserCompany) {
		this.userinfo_generatedByUserCompany = userinfo_generatedByUserCompany;
	}
	public String getUserinfo_generatedByUserPhone() {
		return userinfo_generatedByUserPhone;
	}
	public void setUserinfo_generatedByUserPhone(String userinfo_generatedByUserPhone) {
		this.userinfo_generatedByUserPhone = userinfo_generatedByUserPhone;
	}
	public String getPartnerInfo_companySoldTo() {
		return partnerInfo_companySoldTo;
	}
	public void setPartnerInfo_companySoldTo(String partnerInfo_companySoldTo) {
		this.partnerInfo_companySoldTo = partnerInfo_companySoldTo;
	}
	public String getPartnerinfo_contactFirstName() {
		return partnerinfo_contactFirstName;
	}
	public void setPartnerinfo_contactFirstName(String partnerinfo_contactFirstName) {
		this.partnerinfo_contactFirstName = partnerinfo_contactFirstName;
	}
	public String getPartnerInfo_contactLastName() {
		return partnerInfo_contactLastName;
	}
	public void setPartnerInfo_contactLastName(String partnerInfo_contactLastName) {
		this.partnerInfo_contactLastName = partnerInfo_contactLastName;
	}
	public String getPartnerInfo_contactPhone() {
		return partnerInfo_contactPhone;
	}
	public void setPartnerInfo_contactPhone(String partnerInfo_contactPhone) {
		this.partnerInfo_contactPhone = partnerInfo_contactPhone;
	}
	public String getPartnerInfo_contactEmail() {
		return partnerInfo_contactEmail;
	}
	public void setPartnerInfo_contactEmail(String partnerInfo_contactEmail) {
		this.partnerInfo_contactEmail = partnerInfo_contactEmail;
	}
	public String getPartnerInfo_companyName() {
		return partnerInfo_companyName;
	}
	public void setPartnerInfo_companyName(String partnerInfo_companyName) {
		this.partnerInfo_companyName = partnerInfo_companyName;
	}
	public String getPartnerInfo_companyAddress() {
		return partnerInfo_companyAddress;
	}
	public void setPartnerInfo_companyAddress(String partnerInfo_companyAddress) {
		this.partnerInfo_companyAddress = partnerInfo_companyAddress;
	}
	public String getPartnerInfo_companyCity() {
		return partnerInfo_companyCity;
	}
	public void setPartnerInfo_companyCity(String partnerInfo_companyCity) {
		this.partnerInfo_companyCity = partnerInfo_companyCity;
	}
	public String getPartnerInfo_companyState() {
		return partnerInfo_companyState;
	}
	public void setPartnerInfo_companyState(String partnerInfo_companyState) {
		this.partnerInfo_companyState = partnerInfo_companyState;
	}
	public String getPartnerInfo_companyZip() {
		return partnerInfo_companyZip;
	}
	public void setPartnerInfo_companyZip(String partnerInfo_companyZip) {
		this.partnerInfo_companyZip = partnerInfo_companyZip;
	}
	public String getPartnerInfo_companyCountry() {
		return partnerInfo_companyCountry;
	}
	public void setPartnerInfo_companyCountry(String partnerInfo_companyCountry) {
		this.partnerInfo_companyCountry = partnerInfo_companyCountry;
	}
	public String getPartnerInfo_licenceNum() {
		return partnerInfo_licenceNum;
	}
	public void setPartnerInfo_licenceNum(String partnerInfo_licenceNum) {
		this.partnerInfo_licenceNum = partnerInfo_licenceNum;
	}
	public String getDistributorInfo_companySoldTo() {
		return distributorInfo_companySoldTo;
	}
	public void setDistributorInfo_companySoldTo(String distributorInfo_companySoldTo) {
		this.distributorInfo_companySoldTo = distributorInfo_companySoldTo;
	}
	public String getDistributorInfo_contactFirstName() {
		return distributorInfo_contactFirstName;
	}
	public void setDistributorInfo_contactFirstName(String distributorInfo_contactFirstName) {
		this.distributorInfo_contactFirstName = distributorInfo_contactFirstName;
	}
	public String getDistributorInfo_contactLastName() {
		return distributorInfo_contactLastName;
	}
	public void setDistributorInfo_contactLastName(String distributorInfo_contactLastName) {
		this.distributorInfo_contactLastName = distributorInfo_contactLastName;
	}
	public String getDistributorInfo_contactPhone() {
		return distributorInfo_contactPhone;
	}
	public void setDistributorInfo_contactPhone(String distributorInfo_contactPhone) {
		this.distributorInfo_contactPhone = distributorInfo_contactPhone;
	}
	public String getDistributorInfo_contactEmail() {
		return distributorInfo_contactEmail;
	}
	public void setDistributorInfo_contactEmail(String distributorInfo_contactEmail) {
		this.distributorInfo_contactEmail = distributorInfo_contactEmail;
	}
	public String getDistributorInfo_companyName() {
		return distributorInfo_companyName;
	}
	public void setDistributorInfo_companyName(String distributorInfo_companyName) {
		this.distributorInfo_companyName = distributorInfo_companyName;
	}
	public String getDistributorInfo_companyAddress() {
		return distributorInfo_companyAddress;
	}
	public void setDistributorInfo_companyAddress(String distributorInfo_companyAddress) {
		this.distributorInfo_companyAddress = distributorInfo_companyAddress;
	}
	public String getDistributorInfo_companyCity() {
		return distributorInfo_companyCity;
	}
	public void setDistributorInfo_companyCity(String distributorInfo_companyCity) {
		this.distributorInfo_companyCity = distributorInfo_companyCity;
	}
	public String getDistributorInfo_companyState() {
		return distributorInfo_companyState;
	}
	public void setDistributorInfo_companyState(String distributorInfo_companyState) {
		this.distributorInfo_companyState = distributorInfo_companyState;
	}
	public String getDistributorInfo_companyZip() {
		return distributorInfo_companyZip;
	}
	public void setDistributorInfo_companyZip(String distributorInfo_companyZip) {
		this.distributorInfo_companyZip = distributorInfo_companyZip;
	}
	public String getDistributorInfo_companyCountry() {
		return distributorInfo_companyCountry;
	}
	public void setDistributorInfo_companyCountry(String distributorInfo_companyCountry) {
		this.distributorInfo_companyCountry = distributorInfo_companyCountry;
	}
	public String getEnduserInfo_companySoldTo() {
		return enduserInfo_companySoldTo;
	}
	public void setEnduserInfo_companySoldTo(String enduserInfo_companySoldTo) {
		this.enduserInfo_companySoldTo = enduserInfo_companySoldTo;
	}
	public String getEnduserInfo_contactFirstName() {
		return enduserInfo_contactFirstName;
	}
	public void setEnduserInfo_contactFirstName(String enduserInfo_contactFirstName) {
		this.enduserInfo_contactFirstName = enduserInfo_contactFirstName;
	}
	public String getEnduserInfo_contactLastName() {
		return enduserInfo_contactLastName;
	}
	public void setEnduserInfo_contactLastName(String enduserInfo_contactLastName) {
		this.enduserInfo_contactLastName = enduserInfo_contactLastName;
	}
	public String getEnduserInfo_contactPhone() {
		return enduserInfo_contactPhone;
	}
	public void setEnduserInfo_contactPhone(String enduserInfo_contactPhone) {
		this.enduserInfo_contactPhone = enduserInfo_contactPhone;
	}
	public String getEnduserInfo_contactEmail() {
		return enduserInfo_contactEmail;
	}
	public void setEnduserInfo_contactEmail(String enduserInfo_contactEmail) {
		this.enduserInfo_contactEmail = enduserInfo_contactEmail;
	}
	public String getEnduserInfo_companyName() {
		return enduserInfo_companyName;
	}
	public void setEnduserInfo_companyName(String enduserInfo_companyName) {
		this.enduserInfo_companyName = enduserInfo_companyName;
	}
	public String getEnduserInfo_companyAddress() {
		return enduserInfo_companyAddress;
	}
	public void setEnduserInfo_companyAddress(String enduserInfo_companyAddress) {
		this.enduserInfo_companyAddress = enduserInfo_companyAddress;
	}
	public String getEnduserInfo_companyCity() {
		return enduserInfo_companyCity;
	}
	public void setEnduserInfo_companyCity(String enduserInfo_companyCity) {
		this.enduserInfo_companyCity = enduserInfo_companyCity;
	}
	public String getEnduserInfo_companyState() {
		return enduserInfo_companyState;
	}
	public void setEnduserInfo_companyState(String enduserInfo_companyState) {
		this.enduserInfo_companyState = enduserInfo_companyState;
	}
	public String getEnduserInfo_companyZip() {
		return enduserInfo_companyZip;
	}
	public void setEnduserInfo_companyZip(String enduserInfo_companyZip) {
		this.enduserInfo_companyZip = enduserInfo_companyZip;
	}
	public String getEnduserInfo_companyCountry() {
		return enduserInfo_companyCountry;
	}
	public void setEnduserInfo_companyCountry(String enduserInfo_companyCountry) {
		this.enduserInfo_companyCountry = enduserInfo_companyCountry;
	}
	
	
	public String toString() {
		return "config Id:" + this.configId +"  Name:" + this.configurationName ;
	}
}
