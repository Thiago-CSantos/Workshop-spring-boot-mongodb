package com.lyzard.workshopmongo.services;

import java.util.Date;
import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.lyzard.workshopmongo.domain.Post;
import com.lyzard.workshopmongo.repository.PostRepository;

public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
	
}
