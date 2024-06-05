package com.example.myweb.user.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.myweb.user.UserService;
import com.example.myweb.user.UserVO;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/userList", method=RequestMethod.GET)
	public String userList(Locale locale, Model model) throws SQLException {
		System.out.println("GET /userList ...");
		List<UserVO> userList = userService.getList(null);
		model.addAttribute("userList", userList);
		
		return "user/list";
	}
	
	@RequestMapping(value="/userDetail", method=RequestMethod.GET)
	public String userDetail(@RequestParam("id") String id, Model model) throws SQLException {
		UserVO vo = new UserVO();
		vo.setId(id);
		UserVO user = userService.getOne(vo);
		model.addAttribute("user", user);
		
		return "user/detail";
	}
	
	@RequestMapping(value="/userUpdate", method=RequestMethod.GET)
	public String userUpdate(@RequestParam("id") String id, Model model) {
		UserVO vo = new UserVO();
		vo.setId(id);
		UserVO user = userService.getOne(vo);
		model.addAttribute("user", user);
		
		return "user/update";
	}
	
	@RequestMapping(value="/userUpdate", method=RequestMethod.POST)
	public String userUpdate2(UserVO vo, Model model) {
		userService.update(vo);
		
		return "redirect:userList";
	}
	
	@RequestMapping(value="/userWrite", method=RequestMethod.GET)
	public String userWrite(UserVO vo) {
		return "user/write";
	}
	
	@RequestMapping(value="/userWrite", method=RequestMethod.POST)
	public String userWriteOk(UserVO vo) {
		userService.insert(vo);
		return "redirect:userList";
	}
	
	@RequestMapping(value="/userDelete", method=RequestMethod.GET)
	public String userDelete(UserVO vo) {
		userService.delete(vo);
		
		return "redirect:userList";
	}
}
