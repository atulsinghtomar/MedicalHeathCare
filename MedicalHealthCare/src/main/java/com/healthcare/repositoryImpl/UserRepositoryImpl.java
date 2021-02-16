package com.healthcare.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.healthcare.model.UserModel;
import com.healthcare.repository.UserRepository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public UserModel createUser(UserModel user) {

		String query = "insert into healthcare(category,firstname,lastname,mobileNumber,address, gender,weight,height) values(?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(query, new Object[] { user.getCategory(), user.getFirstname(), user.getLastname(),
				user.getMobileNumber(), user.getAddress(), user.getGender(), user.getWeight(), user.getHeight() });
		return user;

	}

	@Override
	public UserModel updateUserById(UserModel user) {
		String query = "update healthcare set  category=?,firstname=?,lastname=?, mobileNumber=?,address=?,gender=?,weight=?,height=? where id=?";
		jdbcTemplate.update(query, new Object[] {user.getCategory(), user.getFirstname(),
				user.getLastname(), user.getMobileNumber(),user.getAddress(),user.getGender(),user.getWeight(), user.getHeight(),user.getId()});
				return user;
	}

	@Override
	public int deleteUserById(int id) {
		String query = "delete from healthcare where id = ?";
		return jdbcTemplate.update(query, new Object[] { id });

		
	}

	@Override
	public List<UserModel> getAllUser() {

		
		String query="select * from healthcare";
		List<UserModel> list = jdbcTemplate.query(query, new UserMapper());
	
		
		return list;
	}

	@Override
	public List<UserModel> getUserById(int id) {
		String query = "select id,category, firstName, lastName, mobileNumber, address, gender,weight, height from healthcare where id = ?";
		return jdbcTemplate.query(query, new UserMapper(), id);

		
	}

}
