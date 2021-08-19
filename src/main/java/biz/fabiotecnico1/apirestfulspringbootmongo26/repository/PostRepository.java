package biz.fabiotecnico1.apirestfulspringbootmongo26.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import biz.fabiotecnico1.apirestfulspringbootmongo26.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	//Alternative query
	@Query("{'title': { $regex: ?0, $options: 'i'}}")
	List<Post> searchTitle(String text);
	//Query methods
	List<Post> findByTitleContainingIgnoreCase(String text);
}