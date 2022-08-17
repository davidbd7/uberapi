package com.example.uberdemo.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.uberdemo.model.User;

/*
@Repository

public interface UserRepository extends JpaRepository<User, Long> {

}

*/

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
}