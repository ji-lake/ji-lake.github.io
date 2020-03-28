package com.board.service;

import javax.servlet.http.HttpSession;

import com.board.domain.MemberVO;

public interface MemberService {
	
	// 로그인 체크
	public boolean loginCheck(MemberVO mvo, HttpSession session);
	
	// 로그아웃
	public void logout(HttpSession session);

}
