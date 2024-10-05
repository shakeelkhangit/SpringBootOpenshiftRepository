package com.example.DemoTestreact.Idao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DemoTestreact.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}