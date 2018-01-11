package edu.smxy.mapper;

import java.util.List;

import edu.smxy.dao.Msg;

public interface MsgMapper {
	public void insertMsg(Msg msg);
	public List<Msg> selectAll();
	public List<Msg> selectMy(String username);
	public Msg selectdetail(int msgId);
}
