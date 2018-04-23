package uta.com.cateringsystem.service.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import uta.com.cateringsystem.service.beans.User;
import uta.com.cateringsystem.service.dao.impl.DbManagerImpl;
@RestController
public class LoginController {
	
	@Autowired
	DbManagerImpl dbManager;
	
	
	User user;
	
	@RequestMapping("/login")
	public  @ResponseBody User performLogin(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "password") String password) {
		user = dbManager.getUser(userName);
		
		if(user.validatePassword(password)) {
			return user;
		}else {
			return null;
		}
		
	}

}
