package edu.smxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.smxy.dao.User;
import edu.smxy.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public void InsertUser(User user){
		userMapper.InsertUser(user);
	}
	public boolean selectExist(User user){
		if(userMapper.selectExist(user)!=null){
			return false;
		}
		else{
			return true;
		}
	}
	public void Insertimg(User user){
		userMapper.Insertimg(user);
	}
	public User loginCheck(User user){
		return userMapper.loginCheck(user);
	}
}
