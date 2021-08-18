package biz.fabiotecnico1.apirestfulspringbootmongo26.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import biz.fabiotecnico1.apirestfulspringbootmongo26.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
}