package com.board.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.MemberDAO;
import com.board.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO dao;

	@Override
	public boolean loginCheck(MemberVO mvo, HttpSession session) {
		
		boolean result = dao.loginCheck(mvo);
		if (result == true) { //true 일 경우 세션 등록
			//세션 변수 등록
		}
		
		return result;
	}

	@Override
	public void logout(HttpSession session) {
		dao.logout(session);
		
	}
	
}
