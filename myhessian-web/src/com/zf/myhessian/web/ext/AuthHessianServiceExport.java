package com.zf.myhessian.web.ext;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.remoting.caucho.HessianServiceExporter;

public class AuthHessianServiceExport extends HessianServiceExporter{

	@Override
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String auth = request.getHeader("auth");
		if(!"is_zhoufeng".equals(auth)){
			response.getWriter().write("no permition!");
			System.out.println("发现非法请求,ip:" + request.getRemoteAddr() + ",url:" + request.getRequestURL());
			return ;
		}  
		
		super.handleRequest(request, response);
	}
	
}
