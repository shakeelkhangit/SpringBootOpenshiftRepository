package com.example.DemoTestreact.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DemoTestreact.model.User;
import com.example.DemoTestreact.serviceImpl.IUserServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TestController {

	@Autowired
	IUserServiceImpl userServiceImpl;

	@GetMapping("/api/get")
	public ResponseEntity<List<User>> geUsers() {
		{
			List<User> users = userServiceImpl.getUsers();
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);

		}
	}

	@GetMapping("/api/get/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable("id") Integer id) {
		{
			Optional<User> user = userServiceImpl.getUserById(id);
			return new ResponseEntity<Optional<User>>(user, HttpStatus.OK);

		}
	}

	@PostMapping("api/save")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		user = userServiceImpl.createUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@PutMapping("api/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
		user.setId(id);
		user = userServiceImpl.updateUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@DeleteMapping("api/delete/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable("id") Integer id) {
		userServiceImpl.deleteUser(id);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
