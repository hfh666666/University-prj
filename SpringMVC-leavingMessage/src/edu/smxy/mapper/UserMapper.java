package edu.smxy.mapper;

import edu.smxy.dao.User;

public interface UserMapper {
	public void InsertUser(User user);
	public void Insertimg(User user);
	public User selectExist(User user);
	public User loginCheck(User user);
}
