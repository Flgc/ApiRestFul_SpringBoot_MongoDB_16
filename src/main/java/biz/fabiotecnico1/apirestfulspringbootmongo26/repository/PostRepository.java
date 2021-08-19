package biz.fabiotecnico1.apirestfulspringbootmongo26.repository;

import java.util.Date;
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
	
	//Multi-criteria query
	@Query("{ $and: [ { date: {$gte: ?1} }, { date: {$lte: ?2} },"
			+ " { $or: [ {'title': { $regex: ?0, $options: 'i'}}"
			+ ", {'body': { $regex: ?0, $options: 'i'}},"
			+ " {'comments.text': { $regex: ?0, $options: 'i'}} ] } ] }")
	List<Post> fullSearch(String text, Date minDate, Date maxDate);
	
}