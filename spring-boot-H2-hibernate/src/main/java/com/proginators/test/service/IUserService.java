package com.proginators.test.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.proginators.test.entity.User;

@Service
@Transactional
public interface IUserService {

	Optional<User> findUserById(Long userId);

	User addNewUser(User user);

	User modifyUser(User user);

	void deleteUser(Long userId);

	List<User> findAllUsers();
}
