package com.care.cs.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieQuizController {
	
	@RequestMapping("cookie/cookie") 
	public void cookie() {}
	
	@RequestMapping("cookie/popup")	
	public void popup() {}
	
	@RequestMapping("cookie/make")
	public String make(HttpServletResponse response) {
		Cookie coo = new Cookie("quizName", "quizValue");
		coo.setMaxAge(30);
		response.addCookie(coo);
		return "redirect:popup";
	}
}











