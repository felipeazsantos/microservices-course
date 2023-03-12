package com.felipeazsantos.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeazsantos.hruser.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
