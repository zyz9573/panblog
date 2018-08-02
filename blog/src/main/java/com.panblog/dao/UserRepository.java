package com.panblog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.panblog.domain.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	/**
	 * define your own query other than offered by JpaRepository
	 */
}