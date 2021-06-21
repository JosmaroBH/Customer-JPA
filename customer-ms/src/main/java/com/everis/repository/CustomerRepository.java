package com.everis.repository;

import com.everis.entity.Customer;
import com.everis.entity.Region;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>  {
	
		public List<Customer> findByRegion(Region region);
		
		public Customer findByNumberID(String numberID);
		
        @Query(value = "select * from tbl_customers p where p.id = :id", nativeQuery = true)
        public Customer findCustomerById(@Param("id") Long id);



        
}

