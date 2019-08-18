package com.proy_int.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proy_int.user_service.model.User;
import com.proy_int.user_service.repository.UserRepository;

@RestController
@RequestMapping("")
public class UserController {

	@Autowired
	private UserRepository repository;

	@GetMapping("/users/exist/{cedula}")
	public ResponseEntity<User> getByCedula(@PathVariable String cedula) {
		User user = repository.findByCedula(cedula);
		if(user == null) {
			user = new User(cedula);
		}
		return ResponseEntity.ok(user);
	}

}
