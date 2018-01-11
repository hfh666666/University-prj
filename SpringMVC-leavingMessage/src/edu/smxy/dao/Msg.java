package edu.smxy.dao;

public class Msg {
	private int msgId;
	private String msgTitle;
	private String msgContent;
	private String msgTime;
	private String username;
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getMsgTime() {
		return msgTime;
	}
	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Msg(int msgId, String msgTitle, String msgContent, String msgTime, String username) {
		super();
		this.msgId = msgId;
		this.msgTitle = msgTitle;
		this.msgContent = msgContent;
		this.msgTime = msgTime;
		this.username = username;
	}
	public Msg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
