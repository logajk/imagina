package com.vector.dao.user;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.vector.model.User;

public class UserDAOImpl implements UserDAO {

	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<User> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM users";
		
		return jdbcTemplate.query(sql, new UserRowMapper());
	}	
}
