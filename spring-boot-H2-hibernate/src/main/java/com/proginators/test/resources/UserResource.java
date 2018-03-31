package com.proginators.test.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proginators.test.entity.User;
import com.proginators.test.service.IUserService;

@RestController
public class UserResource {

	@Autowired
	private IUserService userService;

	@RequestMapping(method = { RequestMethod.POST })
	public Optional<User> findUserById(@RequestBody Long userId) {
		return userService.findUserById(userId);
	}
}
