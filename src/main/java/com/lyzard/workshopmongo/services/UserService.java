package com.lyzard.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyzard.workshopmongo.domain.User;
import com.lyzard.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository respo;
	
	public List<User> findAll(){
		return respo.findAll();
	}
	
}
