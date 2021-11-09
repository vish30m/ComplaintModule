package com.service;
import java.util.List;
import java.util.Optional;

import com.exceptions.InValidDomainException;
import com.exceptions.InvalidEngineerIdException;
import com.entities.Complaint;
import com.entities.Engineer;

public interface AdminService {
	//public Engineer addEngineer(Engineer e);
	//public Optional<Engineer> changeDomain(int engineerId,String newDomain)throws InValidDomainException,InvalidEngineerIdException;
	public String removeEngineer(int engineerId)throws InvalidEngineerIdException;
	
	//public List<Engineer> getComplaintsByProducts(String productCategoryName);
	public List<Engineer> getComplaints(String status,String productCategoryName);
	
	//public Engineer replaceEngineerFromComplaint(int complaintId)throws InValidDomainException; // replace engineer from the complaint and allocate new engineer
	
	

}