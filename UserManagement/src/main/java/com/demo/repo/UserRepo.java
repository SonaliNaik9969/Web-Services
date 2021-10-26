package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.User;
@Repository 
public interface UserRepo extends JpaRepository<User, Long> {

	User findUserByEmailAndTempPassword(String email, String tempPassword);

	User findUserByEmail(String email);

}
