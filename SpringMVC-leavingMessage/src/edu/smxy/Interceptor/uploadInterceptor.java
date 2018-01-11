package edu.smxy.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class uploadInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		if(arg0 instanceof MultipartHttpServletRequest){
			MultipartHttpServletRequest mRequest=(MultipartHttpServletRequest) arg0;
			MultipartFile file=mRequest.getFile("file");
			String fileName=file.getOriginalFilename();
			String fileTypes="jpg,txt,rar,png";
			String fileType=fileName.substring(fileName.indexOf(".")+1);
			if(fileTypes.contains(fileType)){
				return true;
			}
			else{
				arg0.setAttribute("msg", "文件类型不允许！");
				arg0.getRequestDispatcher("upload.jsp").forward(arg0, arg1);
			}
		}
		
		
		return false;
	}

}
