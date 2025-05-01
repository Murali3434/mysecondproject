package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.application.entity.AppEntity;
import com.application.exceptionhandling.Idnotfoundexception;
import com.application.exceptionhandling.Namenotfoundexception;
import com.application.exceptionhandling.Noofusersmismatchexception;
import com.application.exceptionhandling.Ratingnotfound;
import com.application.service.AppService;

import Pojo.EmployeePojo;

@RestController
public class AppController {
@Autowired
AppService as;


@PostMapping (value="/postall")
public String getpostall(@RequestBody List<AppEntity> a){
	return as.getpostall(a);
}

@GetMapping (value="/getoneobject/{n}")
public AppEntity getoneobject(@PathVariable int n) {
	return as.getoneobject(n);
}


@GetMapping (value="/getname/{name}")
public List<AppEntity>getname(@PathVariable String name)throws Namenotfoundexception{
	return as.getname(name);
}


@GetMapping (value="/getbyid/{n}")
public List<AppEntity> getbyid(@PathVariable int n) throws Idnotfoundexception{
	return as.getbyid(n);
}

@GetMapping (value="/getuser/{n}")
public List<AppEntity>getuser(@PathVariable int n) throws Noofusersmismatchexception{
	return as.getuser(n);
}


@GetMapping (value="/getrating/{n}")
public List<AppEntity> getrating(@PathVariable int n) throws Ratingnotfound{
	return as.getrating(n);
}


/////////////////Rest Template class//////////////////////////////////////////////////////////////

@Autowired
RestTemplate rt;

@GetMapping (value="/getvalue")
public String getword() {
	String a= "http://localhost:8080/get";
	ResponseEntity<String>re = rt.exchange(a,HttpMethod.GET,null,String.class);
String result = re.getBody();
return result;

}

@GetMapping (value="/getname11/{a}")
public String getname1(@PathVariable String a) {
	String b= "http://localhost:8080/getthis/";
	ResponseEntity<String> rr = rt.exchange(b+a,HttpMethod.GET,null,String.class);
	String result = rr.getBody();
	return result;
}



@GetMapping (value="/getallEmployee1")
public List<EmployeePojo> getallemployee(){
	String a = "http://localhost:9098/getall";
	ResponseEntity<List<EmployeePojo>> rs=rt.exchange(a, HttpMethod.GET,null,new ParameterizedTypeReference<List<EmployeePojo>>() {});
List<EmployeePojo> result=rs.getBody();
return result; 
}

@GetMapping (value="/getoneempobject/{n}")
public EmployeePojo getone(@PathVariable int n){
	String a= "http://localhost:9098/getoneobject/";
	ResponseEntity<EmployeePojo> rs= rt.exchange(a+n,HttpMethod.GET,null,new ParameterizedTypeReference<EmployeePojo>() {});
EmployeePojo result = rs.getBody();
return result;

}

}
