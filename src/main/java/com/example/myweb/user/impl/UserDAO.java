package com.example.myweb.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.myweb.user.UserVO;

@Repository
public class UserDAO {
	public static final List<UserVO> memberList;
	static {
		memberList = new ArrayList<UserVO>();
		memberList.add(new UserVO("hong", "1234", "관리자", "Admin"));
		memberList.add(new UserVO("user1", "1234", "홍길동", "User"));
		memberList.add(new UserVO("user2", "1234", "김길동", "User"));
		memberList.add(new UserVO("user3", "1234", "이길동", "User"));
		memberList.add(new UserVO("user4", "1234", "오징어", "User"));
	}
	
	public List<UserVO> selectAll() {
		System.out.println(">>> selectAll() 실행");
		return memberList;
	}
	
	public UserVO findById(UserVO dto) {
		int idx = memberList.indexOf(dto);
		UserVO member = null;
		if(idx != -1) {
			member = memberList.get(idx);
		}
		return member;
	}
	
	public void insert(UserVO dto) {
		memberList.add(dto);
	}
	
	public void update(UserVO dto) {
		int idx = memberList.indexOf(dto);
		if(idx != -1) {
			memberList.set(idx, dto);
		}
	}
	
	public void delete(UserVO dto) {
		System.out.println("delete: " + dto);
		int idx = memberList.indexOf(dto);
		UserVO member = null;
		if(idx != -1) {
			memberList.remove(idx);
		}
	}

	public List<UserVO> getUserList(UserVO vo) {
		List<UserVO> userList = new ArrayList<UserVO>();
		for(int i=0; i<memberList.size(); i++) {
			if(memberList.get(i).equals(vo)) {
				userList.add(memberList.get(i));
			}
		}
		return userList;
	}
}