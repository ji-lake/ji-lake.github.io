package com.board.dao;

import javax.servlet.http.HttpSession;

import com.board.domain.MemberVO;

public interface MemberDAO {
	
	//로그인 체크
	public boolean loginCheck(MemberVO mvo);
	
	// 로그아웃
	public void logout(HttpSession session);

}
