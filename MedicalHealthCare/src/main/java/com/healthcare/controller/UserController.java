package com.healthcare.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.exceptionHandler.User;
import com.healthcare.model.UserModel;
import com.healthcare.service.UserService;

@RestController

public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ResponseEntity<UserModel> createUser(@RequestBody UserModel user) {
		UserModel model = userService.createUser(user);

		if (model != null) {
			model.setCategory(user.getCategory());
			model.setFirstname(user.getFirstname());
			model.setLastname(user.getLastname());
			model.setMobileNumber(user.getMobileNumber());
			model.setAddress(user.getAddress());
			model.setGender(user.getGender());
			model.setWeight(user.getWeight());
			model.setHeight(user.getHeight());
			logger.info("User SuccessFully Saved");
			throw new User("Data SuccessFuly Inserted");

		}

		return new ResponseEntity<UserModel>(model, HttpStatus.OK);

	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public ResponseEntity<UserModel> updateById(@PathVariable("id") int id, @RequestBody UserModel user) {

		UserModel model = userService.updateUserById(user);
		if (model != null) {
			model.setId(user.getId());
			model.setCategory(user.getCategory());
			model.setFirstname(user.getFirstname());
			model.setLastname(user.getLastname());
			model.setMobileNumber(user.getMobileNumber());
			model.setAddress(user.getAddress());
			model.setGender(user.getGender());
			model.setWeight(user.getWeight());
			model.setHeight(user.getHeight());

			logger.info("Data SuccessFully Updated");

			throw new User("Data SuccessFully Updated ");

		}

		return new ResponseEntity<UserModel>(model, HttpStatus.OK);

	}

	@RequestMapping(value = "/getAllUser/", method = RequestMethod.GET)
	public ResponseEntity<List<UserModel>> getAllUser() {
		List<UserModel> list = userService.getAllUser();
		if (list.isEmpty()) {

			logger.info("List Is Empty");

			throw new User("List Is Empty");

		}

		return new ResponseEntity<List<UserModel>>(list, HttpStatus.OK);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<UserModel> deleteUserById(@PathVariable("id") int id) {

		userService.deleteUserById(id);
		if (id > 0) {

			logger.info("Data SuccessFully Deleted");

			throw new User("Data SuccessFully Deleted");
		}

		return new ResponseEntity<UserModel>(HttpStatus.OK);

	}

	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<UserModel>> findUserById(@PathVariable("id") int id) {

		List<UserModel> users = userService.getUserById(id);
		if (users == null) {
			logger.info("User Not Availabel");

			throw new User("User Not Availabel");
		}

		return new ResponseEntity<List<UserModel>>(users, HttpStatus.OK);

	}

}
