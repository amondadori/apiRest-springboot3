package com.andreyRest.projetoSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andreyRest.projetoSpring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u1 = new User(1L, "andrey", "andrey@", "999999", "123465");
		return ResponseEntity.ok().body(u1);
	}
}
