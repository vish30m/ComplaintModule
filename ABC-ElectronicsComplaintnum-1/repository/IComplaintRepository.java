package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.entities.Complaint;


@Repository
public interface IComplaintRepository extends JpaRepository<Complaint,Integer> {
	
	

	
	/*
	 * @Query("Select c from Complaint c  order by c.complaintName") List<Complaint>
	 * findByComplaintName(String complaintName);
	 * 
	 * @Query("Select c from Complaint c  order by c.productModelNumber")
	 * List<Complaint> findByProductModelNumber(String productModelNumber);
	 * 
	 * //public Complaint findByComplaintId(int complaintId);
	 */	 
}
