package edu.smxy.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.cookie;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import edu.smxy.dao.User;
import edu.smxy.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("regedit")
	public ModelAndView regeditUser(User user,Model model,HttpServletResponse response){
		if(!userService.selectExist(user)){
			model.addAttribute("msg", "用户名已经存在");
		}
		else{
			userService.InsertUser(user);
			response.addCookie(new Cookie("username", user.getUsername()));
			model.addAttribute("msg", "注册成功，点击<a href='upload.jsp'>下一步</a>进行相片上传");
		}
		return new ModelAndView("forward:/index.jsp");
	}
	@RequestMapping("upload.do")
	public ModelAndView upload(@RequestParam("file") MultipartFile file,HttpServletRequest request,Model model,HttpServletResponse response) throws IllegalStateException, IOException{
		String realPath=request.getServletContext().getRealPath("/upload")+"/"+file.getOriginalFilename();
		String username=request.getCookies()[1].getValue();
		User user=new User(username,realPath);
		System.out.println(username);
		userService.Insertimg(user);
		if(file.getSize()!=0){
			file.transferTo(new File(realPath));
			model.addAttribute("msg", "上传成功");
			return new ModelAndView("forward:/login.jsp");
		}
		else{
			model.addAttribute("msg", "文件为空");
			return new ModelAndView("forward:/upload.jsp");
		}
	}
	
	@RequestMapping("login.do")
	public ModelAndView login(User user,Model model,HttpServletRequest request){
		User usercheck=userService.loginCheck(user);
		if(usercheck!=null){
			request.getSession().setAttribute("msg1", usercheck.getImg_path());
			request.getSession().setAttribute("username", usercheck.getUsername());
			return new ModelAndView("insertview");
		}
		else{
			model.addAttribute("msg1", "用户名或密码错误");
			return  new ModelAndView("forward:/login.jsp");
		}
	}
}
