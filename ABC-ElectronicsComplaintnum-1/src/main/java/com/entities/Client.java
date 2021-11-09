//package com.entities;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//@Entity
//public class Client {
//@Id
//@GeneratedValue
//	private String clinetId; // unique String name like mike123
//private String password;
//private List<Product> productOwned;
//private String address;
//private long phoneNumber;
//@OneToMany(cascade=CascadeType.ALL)
//private List<Complaint> complaintList; // client can view all complaints
//
//	public String getClinetId() {
//	return clinetId;
//}
//public void setClinetId(String clinetId) {
//	this.clinetId = clinetId;
//}
//public String getPassword() {
//	return password;
//}
//public void setPassword(String password) {
//	this.password = password;
//}
//public List<Product> getProductOwned() {
//	return productOwned;
//}
//public void setProductOwned(List<Product> productOwned) {
//	this.productOwned = productOwned;
//}
//public String getAddress() {
//	return address;
//}
//public void setAddress(String address) {
//	this.address = address;
//}
//public long getPhoneNumber() {
//	return phoneNumber;
//}
//public void setPhoneNumber(long phoneNumber) {
//	this.phoneNumber = phoneNumber;
//}
//public List<Complaint> getComplaintList() {
//	return complaintList;
//}
//public void setComplaintList(List<Complaint> complaintList) {
//	this.complaintList = complaintList;
//}
//
//@Override
//public String toString() {
//return "Client [clinetId=" + clinetId + ", password=" + password + ", productOwned=" + productOwned + ", address="
//		+ address + ", phoneNumber=" + phoneNumber + ", complaintList=" + complaintList + "]";
//}
//	
//}
