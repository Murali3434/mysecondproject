package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankDao;
import com.bank.entity.BankEntity;

@Service
public class BankService {
@Autowired
BankDao bd;

public String post(List<BankEntity> b) {
	// TODO Auto-generated method stub
	return bd.post(b);
}


public List<BankEntity> getall() {
	// TODO Auto-generated method stub
	return bd.getall();
}


public BankEntity getone(String n) {
	// TODO Auto-generated method stub
	return bd.getone(n);
}
}
