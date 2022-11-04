package com.example.demo.repository;

import java.util.Collection;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.Leader;
import com.example.demo.model.Referral;

public interface ReferralRepository extends JpaRepository<Referral, Long>{
	
	@Transactional
	@Modifying
	@Query(value = "SELECT 	r.eid, u.name, count(*) as total\r\n"
			+ "FROM Referral r, User u\r\n"
			+ "WHERE r.eid = u.id\r\n"
			+ "GROUP BY eid \r\n"
			+ "ORDER BY count(*) desc")
	public Collection<Leader> getLeadersList(); 
}
