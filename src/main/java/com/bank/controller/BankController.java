package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.BankEntity;
import com.bank.service.BankService;

@RestController
public class BankController {
@Autowired
BankService bs;


@PostMapping (value="/postall")
public String post(@RequestBody List<BankEntity> b) {
return bs.post(b);
}

@GetMapping (value ="/getall")
public List<BankEntity> getall(){
	return bs.getall();
}


	@GetMapping (value="/getbyifsc/{n}")
	
	public BankEntity getone(@PathVariable String n) {
		return bs.getone(n);
		
	}

}
