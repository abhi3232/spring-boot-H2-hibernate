package com.proginators.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proginators.test.entity.User;
import com.proginators.test.repository.UserRepository;
import com.proginators.test.service.IUserService;

@Component
public class UserService implements IUserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public Optional<User> findUserById(Long userId) {
		return userRepository.findById(userId);
	}

	@Override
	public User addNewUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User modifyUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long userId) {
		if (userRepository.existsById(userId)) {
			LOGGER.debug("Found user with user id {} , deleting same user", userId);
			userRepository.deleteById(userId);
		} else {
			LOGGER.debug("User with user id {} not found ", userId);
		}
	}

	@Override
	public List<User> findAllUsers() {
		return (List<User>) userRepository.findAll();
	}

}
