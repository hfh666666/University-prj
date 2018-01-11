package edu.smxy.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.smxy.dao.Msg;
import edu.smxy.service.MsgService;

@Controller
public class MsgController {
	@Autowired
	private MsgService msgService;
	
	@RequestMapping("insert.do")
	public String insertMsg(Msg msg,HttpServletRequest request,Model model){
		String msgTitle=request.getParameter("msgTitle");
		String msgContent=request.getParameter("msgContent");
		System.out.println(msgTitle+msgContent);
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String time=format.format(new Date());
		msg.setMsgTime(time);
		String username=(String) request.getSession().getAttribute("username");
		msg.setUsername(username);
		msg.setMsgTitle(msgTitle);
		msg.setMsgContent(msgContent);
		msgService.insertMsg(msg);
		model.addAttribute("msgresult", "添加成功");
		return "insertview";
	}
	
	@RequestMapping("selectall.do")
	public String selectAll(Model model){
		List<Msg> list=msgService.selectAll();
		model.addAttribute("list", list);
		return "insertview";
	}
	@RequestMapping("selectMy.do")
	public String selectMy(@PathParam("username") String username,Model model){
		List<Msg>list=msgService.selectMy(username);
		model.addAttribute("list", list);
		return "insertview";
	}
	
	@RequestMapping("detail.do")
	public String detail(@PathParam("msgId") int msgId,Model model){
		Msg msg=msgService.selectdetail(msgId);
		model.addAttribute("msgdetail", msg);
		return "detailview";
		
	}
	
}
