package com.application.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.entity.AppEntity;
import com.application.repository.AppRepository;

@Repository
public class AppDao {
@Autowired
AppRepository ar;

public String getpostall(List<AppEntity> a) {
	// TODO Auto-generated method stub
	ar.saveAll(a);
	return "succesfull";
}

public AppEntity getoneobject(int n) {
	// TODO Auto-generated method stub
	return ar.findById(n).get();
}

public List<AppEntity> getname(String name) {
	// TODO Auto-generated method stub
	return ar.getname(name); 
}

public List<AppEntity> getbyid(int n) {
	// TODO Auto-generated method stub
	return ar.getbyid(n); 
}

public List<AppEntity> getuser(int n) {
	// TODO Auto-generated method stub
	return ar.getuser(n);
}

public List<AppEntity> getrating(int n) {
	// TODO Auto-generated method stub
	return ar.getrating(n);
}
}
