package biz.fabiotecnico1.apirestfulspringbootmongo26.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.fabiotecnico1.apirestfulspringbootmongo26.domain.Post;
import biz.fabiotecnico1.apirestfulspringbootmongo26.repository.PostRepository;
import biz.fabiotecnico1.apirestfulspringbootmongo26.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
