package com.cosbaseBallTest.web;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cosbaseBallTest.domain.user.User;
import com.cosbaseBallTest.service.UserService;
import com.cosbaseBallTest.web.dto.CMRespDto;
import com.cosbaseBallTest.web.dto.UserPositionRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {
	
//	@GetMapping("/")
//	public String test() {
//		return "index";
//	}
	private final UserService userService;
	
	@GetMapping("/user/joinForm")
	public String joinFrom() {
		return "join/userjoin"; //jsp
	}
	
	@PostMapping("/user/join")
	public String join(User user) {
		userService.선수등록(user);
		return "redirect:/";
	}
	
	@GetMapping("/user/listForm")
	public String listForm(Model model) {
		List<User> users = userService.선수목록();
		model.addAttribute("users", users);
		return "list/userlist";
	}
	
	@GetMapping("/position/listForm")
	public String positionlist(Model model) {
		List<UserPositionRespDto> dtos = userService.포지션선수리스트();
		model.addAttribute("dtos", dtos);
		System.out.println("dtos : "+dtos);
		return "list/positionlist";
	}
	
	@DeleteMapping("/user/{id}")
	public @ResponseBody CMRespDto<?> deleteById(@PathVariable int id) {
		userService.삭제하기(id);
		return new CMRespDto<>(1,null);
	}
	
	
}
