package com.lyzard.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lyzard.workshopmongo.domain.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String>{ //<tipo de clsse que iarar gerenciar, typo do id>
	
}
