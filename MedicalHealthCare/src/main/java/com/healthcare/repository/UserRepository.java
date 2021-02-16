package com.healthcare.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.healthcare.model.UserModel;


public interface UserRepository {
	
	
	public UserModel createUser(UserModel user);
	public UserModel updateUserById(UserModel user);
	public int deleteUserById(int id);
	public List<UserModel> getAllUser();
	public List<UserModel> getUserById(int id);
	
	
	

}
