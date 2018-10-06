package com.proginators.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.proginators.test.entity.Stack;

public interface StackRepository extends CrudRepository<Stack, Long> {

}
