package com.techie.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techie.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
