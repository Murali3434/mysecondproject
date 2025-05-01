package com.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.application.entity.AppEntity;

public interface AppRepository extends JpaRepository<AppEntity,Integer>{

	
	@Query (value="select *from appdetails where name=?;",nativeQuery=true)
	public List<AppEntity> getname(String name);

	
@Query (value="select *from appdetails where id=?;",nativeQuery=true)	
public List<AppEntity> getbyid(int n);

@Query (value="select a from AppEntity a  where a.noofusers>:n")
public List<AppEntity> getuser(@Param("n")int n);


@Query (value="select a from AppEntity a where a.rating=:n")
public List<AppEntity> getrating(@Param("n")int n);

}
