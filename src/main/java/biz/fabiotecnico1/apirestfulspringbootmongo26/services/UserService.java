package biz.fabiotecnico1.apirestfulspringbootmongo26.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.fabiotecnico1.apirestfulspringbootmongo26.domain.User;
import biz.fabiotecnico1.apirestfulspringbootmongo26.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();	
	}
}
