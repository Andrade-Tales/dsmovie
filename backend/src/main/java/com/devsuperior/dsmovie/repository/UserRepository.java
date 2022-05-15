package com.devsuperior.dsmovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.entity.Movie;
import com.devsuperior.dsmovie.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<Movie, Long>{

	User findByEmail(String email);

	User saveAndFlush(User user);
	
}
