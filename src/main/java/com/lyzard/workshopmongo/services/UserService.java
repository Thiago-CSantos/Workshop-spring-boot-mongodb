package com.lyzard.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyzard.workshopmongo.domain.User;
import com.lyzard.workshopmongo.repository.UserRepository;
import com.lyzard.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository respo;
	
	public List<User> findAll(){
		return respo.findAll();
	}

	public Optional<User> findById(String id) {
		Optional<User> user= respo.findById(id);
		
		if(user == null) {
		 throw new ObjectNotFoundException("Objeto não encontrado"); 
		}
		
		return user;
	}
	
}
