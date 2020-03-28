package com.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.board.domain.MemberVO;
import com.board.service.MemberService;

@Controller
@RequestMapping("/member/*")
@SessionAttributes("login")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void getHome(Locale locale, Model model) {
		
		/* logger.info("Welcome home! The client locale is {}.", locale); */
		
		logger.info("________________login 으로 이동합니다_______________");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
	}
	
	// 로그인
	@RequestMapping(value = "/loginCheck.do")
	public ModelAndView loginCheck(@ModelAttribute MemberVO mvo, HttpSession session, Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);		
		String formattedDate = dateFormat.format(date);		
		model.addAttribute("serverTime", formattedDate );
		
		logger.info("_____지금부터 로그인을 할 겁니다_____");
		
		boolean result = memberService.loginCheck(mvo, session);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("member/login");
		
		if(result) {
			mav.addObject("msg", "성공");
			logger.info("__________로그인 성공________");
			logger.info(mvo.getMember_id() + "아이디 입니다.");
			logger.info(mvo.getMember_pwd() + "비밀번호 입니다.");
		} else {
			mav.addObject("msg", "실패");
			logger.info("__________로그인 실패________");
		}
		
		return mav;
	}
	
	// 로그아웃
	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session) {
		
		memberService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/login");
		mav.addObject("msg", "logout");
		logger.info("__________로그아웃 완료________");
		
		return mav;
	}

}
