package com.care.cs.session;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SessionController {
	
	/** 멤버변수로 선언하기 위해 @Autowired 사용 */
	@Autowired private HttpSession session;
	
	@GetMapping("session/index")
	public void index() {
		
	}
	
	@GetMapping("session/login")
	public void login() {
		
	}
	
	@PostMapping("session/login")
	public String login(String id, String pw) {
		if("admin".equals(id) && "1234".equals(pw)) {
			session.setAttribute("id", "admin");
			return "redirect:index";
		}
		return "session/login";
	}
	
	/** session안에 logout없음 알림창 띄우려먼 jsp파일 생성 */
	@RequestMapping("session/logout")
	public String logout() { 
		session.invalidate();
		return "session/logout";
		
	}

}
