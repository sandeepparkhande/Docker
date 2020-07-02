package com.jpa;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJPARepository extends CrudRepository<User, Integer> {

}

