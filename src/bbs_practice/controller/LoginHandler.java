package bbs_practice.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bbs_practice.service.GuestService;

public class LoginHandler implements Command{
	private GuestService service = new GuestService();
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println(id + pwd);
		int res = service.login(id, pwd);
		System.out.println(res);
		if(res == 1) {
			return "main.jsp";
		}else if(res == 0){
			request.setAttribute("message", "비밀번호가 틀립니다.");
		}else if(res == -1) {
			request.setAttribute("message", "존재하지 않는 아이디입니다.");
		}else if(res == -2) {
			request.setAttribute("message", "db에러");
		}
		return "login.jsp";
	}
}
