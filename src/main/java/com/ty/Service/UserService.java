package com.ty.Service;

import com.ty.dao.Userdao;
import com.ty.dto.User;

public class UserService {
	
	Userdao userdao= new Userdao();
	public User saveUser(User user) {
		return userdao.saveUser(user);
		
	}
	public User validateUser(String email,String password) {
		return userdao.validateUser(email, password);
	
		
	}
}
