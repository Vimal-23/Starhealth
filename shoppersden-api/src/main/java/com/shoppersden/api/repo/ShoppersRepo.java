package com.shoppersden.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.shoppersden.api.entity.Users;

@Repository
public interface ShoppersRepo extends JpaRepository<Users, Integer>{
	
	@Query(value = "SELECT * FROM denuser;",nativeQuery = true)
	 public List<Users> findall();
	
	@Query(value ="SELECT userid FROM denuser where username = ?1 and role = ?2 ", nativeQuery = true)
	public Users findbyusernamandrole(String username,String role);


}
