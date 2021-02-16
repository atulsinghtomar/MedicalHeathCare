package com.healthcare.repositoryImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.healthcare.model.UserModel;

public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserModel user = new UserModel();
		user.setId(rs.getInt("id"));
		user.setCategory(rs.getString("category"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setMobileNumber(rs.getString("mobileNumber"));
		user.setAddress(rs.getString("address"));
		user.setGender(rs.getString("gender"));
		user.setWeight(rs.getInt("weight"));
		user.setHeight(rs.getInt("height"));

		return user;
	}

}
