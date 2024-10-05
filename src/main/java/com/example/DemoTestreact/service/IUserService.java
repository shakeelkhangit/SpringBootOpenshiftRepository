package com.example.DemoTestreact.service;

import java.util.List;
import java.util.Optional;

import com.example.DemoTestreact.model.User;

public interface IUserService {

	List<User> getUsers();

	Optional<User> getUserById(Integer user);

	User createUser(User user);

	User updateUser(User user);

	void deleteUser(Integer id);

}
