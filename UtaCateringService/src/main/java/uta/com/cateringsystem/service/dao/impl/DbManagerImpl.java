package uta.com.cateringsystem.service.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import uta.com.cateringsystem.service.beans.User;
import uta.com.cateringsystem.service.dao.DbManager;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class DbManagerImpl implements DbManager{

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public User getUser(String userName) {
		User user = (User) jdbcTemplate.queryForObject("SELECT * FROM user where username = ?",
	            new Object[] { userName }, new BeanPropertyRowMapper(User.class));
	    return user;
	}

}
