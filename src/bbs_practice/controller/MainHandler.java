package bbs_practice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bbs_practice.dto.Guest;

public class MainHandler implements Command{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		Guest loginUser = (Guest) session.getAttribute("loginUser");
		String name = loginUser.getName();
		request.setAttribute("loginUser", loginUser);
		System.out.println(loginUser);
		return "main.jsp";
	}

}
