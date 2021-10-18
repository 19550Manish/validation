package com.validation.dependency.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validation.dependency.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
