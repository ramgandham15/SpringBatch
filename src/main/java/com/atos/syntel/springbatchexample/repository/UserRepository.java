package com.atos.syntel.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atos.syntel.springbatchexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
