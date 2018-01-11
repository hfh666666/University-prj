package edu.smxy.dao;

public class Login {
	private int login_id;
	private String login_username;
	private String login_ip;
	private String login_time;
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	public String getLogin_username() {
		return login_username;
	}
	public void setLogin_username(String login_username) {
		this.login_username = login_username;
	}
	public String getLogin_ip() {
		return login_ip;
	}
	public void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
	}
	public String getLogin_time() {
		return login_time;
	}
	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	public Login(int login_id, String login_username, String login_ip, String login_time) {
		super();
		this.login_id = login_id;
		this.login_username = login_username;
		this.login_ip = login_ip;
		this.login_time = login_time;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
