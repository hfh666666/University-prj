package edu.smxy.dao;

public class User {
	private String username;
	private String password;
	private String img_path;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String img_path) {
		super();
		this.username = username;
		this.password = password;
		this.img_path = img_path;
	}
	public User( String username,String img_path) {
		super();
		this.username = username;
		this.img_path = img_path;
	}
}
