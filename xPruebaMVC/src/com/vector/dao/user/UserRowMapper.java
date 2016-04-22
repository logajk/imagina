package com.vector.dao.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vector.model.User;

public class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int num) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setEnabled(rs.getBoolean("enabled"));
		
		return user;
	}

}
