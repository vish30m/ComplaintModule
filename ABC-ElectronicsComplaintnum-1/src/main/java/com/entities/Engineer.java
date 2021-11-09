package com.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Engineer {
	@Id
	@GeneratedValue
	private int employeeId; // treat like login id
	private String password;
	private String engineerName;
	private String domain; // like washing machine , AC, Mobile phone
	@OneToMany(cascade=CascadeType.ALL)
	private List<Complaint> complaints=new ArrayList<Complaint>();
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEngineerName() {
		return engineerName;
	}
	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public List<Complaint> getComplaints() {
		return complaints;
	}
	public void setComplaints(Complaint complaints) {
		this.complaints.add(complaints) ;
	}
	@Override
	public String toString() {
		return "Engineer [employeeId=" + employeeId + ", password=" + password + ", engineerName=" + engineerName
				+ ", domain=" + domain + ", complaints=" + complaints + "]";
	}
	
	
}
