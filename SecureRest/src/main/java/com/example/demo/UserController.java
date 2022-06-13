package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	List<String> userList;
	
	@GetMapping("/users")
	public ResponseEntity<List<String>> getUsers(){
		return new ResponseEntity<>(userList,HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/users/{userID}")
	public ResponseEntity<String> adduser(@PathVariable("userID") String userID) {
		if(userList==null) {
			userList =  new ArrayList<>();
		}
		userList.add(userID);
		return new ResponseEntity<>("User Created: "+ userID,HttpStatus.CREATED)
		;
	}
	
	public void testMethod() {
		
		
	}
	
	public void legalMethod1() {
		
	}
}
