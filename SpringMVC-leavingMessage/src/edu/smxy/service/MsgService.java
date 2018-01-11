package edu.smxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.smxy.dao.Msg;
import edu.smxy.mapper.MsgMapper;

@Service
public class MsgService {
	@Autowired
	private MsgMapper msgMapper;
	public void insertMsg(Msg msg){
		msgMapper.insertMsg(msg);
	}
	public List<Msg> selectAll(){
		List<Msg> list=msgMapper.selectAll();
		return list;
	}
	public List<Msg> selectMy(String username){
		return msgMapper.selectMy(username);
	}
	public Msg selectdetail(int msgId){
		return msgMapper.selectdetail(msgId);
	}
}
