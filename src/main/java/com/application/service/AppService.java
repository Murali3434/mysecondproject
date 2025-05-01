package com.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.AppDao;
import com.application.entity.AppEntity;
import com.application.exceptionhandling.Idnotfoundexception;
import com.application.exceptionhandling.Namenotfoundexception;
import com.application.exceptionhandling.Noofusersmismatchexception;
import com.application.exceptionhandling.Ratingnotfound;

@Service
public class AppService {
@Autowired
AppDao ad;

public String getpostall(List<AppEntity> a) {
	// TODO Auto-generated method stub
	return ad.getpostall(a);
}

public AppEntity getoneobject(int n) {
	// TODO Auto-generated method stub
	return ad.getoneobject(n);
}

public List<AppEntity> getname(String name) throws Namenotfoundexception{
	// TODO Auto-generated method stub
	if(ad.getname(name).isEmpty()) {
		throw new Namenotfoundexception();
		
	}
	else {
		return ad.getname(name);
	}
	
}

public List<AppEntity> getbyid(int n) throws Idnotfoundexception{
	// TODO Auto-generated method stub
	if(ad.getbyid(n).isEmpty()){
		throw new Idnotfoundexception("id not found");
		
	}
	else {
		return ad.getbyid(n);
	}
}

public List<AppEntity> getuser(int n) throws Noofusersmismatchexception {
	// TODO Auto-generated method stub
	if(ad.getuser(n).isEmpty()) {
		throw new Noofusersmismatchexception();
	}
	else {
	return ad.getuser(n);
}
}

public List<AppEntity> getrating(int n) throws Ratingnotfound {
	// TODO Auto-generated method stub
	if(ad.getrating(n).isEmpty()) {
		throw new Ratingnotfound("rating not found");
	}
	else {
	return ad.getrating(n);
}}






}
