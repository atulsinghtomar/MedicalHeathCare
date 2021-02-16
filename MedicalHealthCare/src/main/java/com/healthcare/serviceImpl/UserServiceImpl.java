package com.healthcare.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.model.UserModel;
import com.healthcare.repository.UserRepository;
import com.healthcare.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserModel createUser(UserModel user) {
		UserModel model = userRepository.createUser(user);
		return model;
	}

	@Override
	public UserModel updateUserById(UserModel user) {
		UserModel model = userRepository.updateUserById(user);
		return model;
	}

	@Override
	public int deleteUserById(int id) {
		  return userRepository.deleteUserById(id);
	}

	@Override
	public List<UserModel> getAllUser() {
		List<UserModel> model =userRepository.getAllUser();
		return model;
	}

	@Override
	public List<UserModel> getUserById(int id) {
		List<UserModel> model = userRepository.getUserById(id);
		return model;
	}

}
