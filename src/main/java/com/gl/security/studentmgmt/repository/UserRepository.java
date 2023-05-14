package com.gl.security.studentmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.security.studentmgmt.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("select u from User u where u.username = ?1")
	public User getUserByUserName(String username);

}
