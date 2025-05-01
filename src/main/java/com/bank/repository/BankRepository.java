package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.entity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity,Integer>{

	
	@Query (value="select * from bankdetails where ifsc=?;",nativeQuery=true)
	public BankEntity getone(String n) ;
	
}
