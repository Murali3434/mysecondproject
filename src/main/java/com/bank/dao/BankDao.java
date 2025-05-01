package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.BankEntity;
import com.bank.repository.BankRepository;

@Repository
public class BankDao {
@Autowired 
BankRepository br;

public String post(List<BankEntity> b) {
	// TODO Auto-generated method stub
	br.saveAll(b);
	return "Success";
}


public List<BankEntity> getall() {
	// TODO Auto-generated method stub
	return br.findAll();
}



public BankEntity getone(String n) {
	// TODO Auto-generated method stub
	
	return br.getone(n);
}
}
