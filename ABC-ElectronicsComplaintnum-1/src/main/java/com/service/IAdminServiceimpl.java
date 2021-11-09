 package com.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.exceptions.InValidDomainException;
import com.exceptions.InvalidEngineerIdException;
import com.entities.Complaint;
import com.entities.Engineer;
import com.repository.AdminRepository;
import com.repository.IComplaintRepository;
import com.repository.IEngineerRepository;



@Service
public class IAdminServiceimpl implements AdminService{
    @Autowired
	AdminRepository adminrepo;
    @Autowired
    IEngineerRepository repoe;
    @Autowired
    IComplaintRepository repo;
	
	//@Override
	//public int addEngineer(Engineer e) 
	{
		//return adminrepo.save(e);
		}

	//@Override
	//public int changeDomain(int engineerId, String newDomain)
		//	throws InValidDomainException, InvalidEngineerIdException {
	   
		//Supplier s1= ()->new InvalidEngineerIdException(" Does not exist in the database");
		//int domain=repoe.findById(engineerId);
		//return domain;
		
	//}

	@Override
	public String removeEngineer(int engineerId) throws InvalidEngineerIdException {
		
		Supplier s1= ()->new InvalidEngineerIdException(" Does not exist in the database");
		repoe.deleteById(engineerId);
		return "deleted";
	}

	//@Override
	//public List<Engineer> getComplaintsByProducts(String productCategoryName) {
		//List<Engineer> c1=repo.findAll();
	//	return c1;
		
	//}

	@Override
	public List<Engineer> getComplaints(String status, String productCategoryName) {
	 List<Engineer> e1=repoe.findAll();
	 return e1;
	}

	//@Override
	//public Complaint replaceEngineerFromComplaint(int complaintId) throws InValidDomainException {
		//Supplier s1= ()->new InValidDomainException(" Does not exist in the database");
	//	Complaint compalint=repoe.findById(complaintId);
		
		
	//}

}
