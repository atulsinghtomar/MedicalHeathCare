package com.healthcare.service;

import java.util.List;

import com.healthcare.model.UserModel;

public interface UserService {

	
	public UserModel createUser(UserModel user);
	public UserModel updateUserById(UserModel user);
	public int deleteUserById(int id);
	public List<UserModel> getAllUser();
	public List<UserModel> getUserById(int id);
	
}
