package com.proginators.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.proginators.test.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
