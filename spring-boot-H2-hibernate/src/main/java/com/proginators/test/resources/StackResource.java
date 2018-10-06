package com.proginators.test.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proginators.test.entity.Stack;
import com.proginators.test.repository.StackRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "Stack Resource for the implementation of stack operations")
public class StackResource {

	@Autowired
	private StackRepository stackRepository;

	private Stack lastAddedData;

	@RequestMapping(value = { "/stack/add" }, method = { RequestMethod.POST })
	@ApiOperation(value = "Operation to add element in stack, i.e. it is a push operation for stack")
	public <T extends Object> void add(@ApiParam(value = "stack information to push element") Stack stack) {
		stackRepository.save(stack);
		lastAddedData = stack;
	}

	@RequestMapping(value = { "/stack/remove" }, method = { RequestMethod.POST })
	@ApiOperation(value = "Operation to remove element from stack, i.e. it is a pop operation for stack")
	public Stack remove() {
		stackRepository.delete(lastAddedData);
		return lastAddedData;
	}

}
