package com.care.dbXml.controll;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.care.dbXml.service.MemberService;
import com.care.dbXml.dto.MemberDTO;


/* http://localhost:8086/dbXml/index */

@Controller
public class MemberControll {
	@Autowired	private MemberService service;
	@Autowired	private HttpSession session;
	
	
	@RequestMapping("index")
	public String index() {
		return "member/index";
	}
	
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	
	
	@PostMapping("login")
	public String login(MemberDTO member, Model model, RedirectAttributes ra) {
		String result = service.login(member);
		if(result.equals("로그인 되었습니다.")) {
			//로그인 성공
			ra.addFlashAttribute("msg", result);
			return "redirect:index";
		}
		// 로그인 실패
		model.addAttribute("msg", result);
		return "member/login";
	}
	
	@RequestMapping("logout")
	public String logout( Model model) {
		session.invalidate();
		model.addAttribute("msg", "로그 아웃");
		return "member/index";
	}
	
	@GetMapping("register")
	public String register() {
		return "member/register";
	}
	
	@PostMapping("register")
	public String register(MemberDTO member, String confirmPw, Model model, RedirectAttributes ra) {
		String result = service.register(member, confirmPw);
		if(result.equals("회원 정보가 등록되었습니다.")) {
			ra.addFlashAttribute("msg", result);
			return "redirect:index";
		}
		model.addAttribute("msg", result);
		return "member/register";
	}
	
	@RequestMapping("list")
	public String list(
			@RequestParam(value="currentPage", required = false)String cp, 
			String search, String select, Model model) {
		
		service.list(cp, search, select, model);
		
		return "member/list";
	}
	@GetMapping("delete")
	public String delete() {
		String sessionId = (String)session.getAttribute("id");
		if(sessionId == null || sessionId.isEmpty()) {
			return "redirect:login";
		}
		return "member/delete";
	}
	
	@PostMapping("delete")
	public String delete(String pw, String confirmPw, RedirectAttributes ra, Model model) {
		String sessionId = (String)session.getAttribute("id");
		if(sessionId == null || sessionId.isEmpty()) {
			return "redirect:login";
		}
		
		String result = service.delete(pw, confirmPw);
		if(result.equals("회원 정보가 삭제되었습니다.")) {
			ra.addFlashAttribute("msg", result);
			session.invalidate();
			return "redirect:index";
		}
		model.addAttribute("msg", result);
		return "member/delete";
	}
}
