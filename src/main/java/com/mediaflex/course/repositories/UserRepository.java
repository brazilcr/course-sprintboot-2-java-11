package com.mediaflex.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediaflex.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
