package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Complaint;
import com.entities.Engineer;
import com.exceptions.InValidDomainException;
import com.exceptions.InvalidEngineerIdException;
import com.service.IAdminServiceimpl;

@RestController
@RequestMapping(path="/api")
public class AdminController {
	@Autowired
	IAdminServiceimpl iadmin;
	//@PostMapping("/addComplaint")
	//public int addEngineer(@RequestBody Engineer e)  {
	//	int d=iadmin.addEngineer(e);
	//	return d;
	//}
	//@PutMapping("/changeDomain/{engineerId}")
	//public ResponseEntity<Integer> changeDomain(@PathVariable int engineerId, @RequestBody String newDomain)
		//	throws InValidDomainException, InvalidEngineerIdException{
		//int a1=iadmin.changeDomain(engineerId,newDomain); 
		//  ResponseEntity re=new ResponseEntity<Integer>(a1,HttpStatus.OK);
	//	  return re;
	//}
	@DeleteMapping("/removeEngineer/{engineerId}")
	public ResponseEntity removeEngineer(@PathVariable int engineerId) throws InvalidEngineerIdException {
		iadmin.removeEngineer(engineerId);
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	//@GetMapping("/getComplaintsByProducts/{productCategoryName}")
	//public ResponseEntity<List<Engineer>> getComplaintsByProducts(@PathVariable String productCategoryName){
	//	List<Engineer> le=iadmin.getComplaintsByProducts(productCategoryName);
	//	  ResponseEntity re=new ResponseEntity<List<Engineer>>(le,HttpStatus.OK);
	//	  return re;
	//}
	
	@GetMapping("/getComplaints/{status}")
	public ResponseEntity<List<Engineer>> getComplaints(@PathVariable String status,@RequestBody String productCategoryName) {
	List<Engineer> le=iadmin.getComplaints(status,productCategoryName);
	  ResponseEntity re=new ResponseEntity<List<Engineer>>(le,HttpStatus.OK);
	  return re;}

//	@PutMapping("/replaceEngineer/{complaintId}")
	//public ResponseEntity<Complaint> replaceEngineerFromComplaint(int complaintId) throws InValidDomainException{
		//Engineer a1=iadmin.replaceEngineerFromComplaint(complaintId); 
		 // ResponseEntity re=new ResponseEntity<Engineer>(a1,HttpStatus.OK);
		//  return re;
	//}
}
