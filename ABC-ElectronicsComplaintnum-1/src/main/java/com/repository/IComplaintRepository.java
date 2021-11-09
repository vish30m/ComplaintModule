package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entities.Complaint;
import com.entities.Engineer;





@Repository
public interface IComplaintRepository extends JpaRepository<Complaint,Integer> {
	
	
@Query("Select c from Complaint c where c.clientId=?1")
List<Complaint> getClientAllComplaints(String clientId);

@Query("Select c from Complaint c where c.clientId=?1 and c.status=?2")
List<Complaint> getClientAllOpenComplaints(String clientId, String status);

	


	
	
}
