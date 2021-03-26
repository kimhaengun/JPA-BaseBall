package com.cosbaseBallTest.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cosbaseBallTest.domain.stadium.Stadium;
import com.cosbaseBallTest.domain.team.Team;
import com.cosbaseBallTest.service.StadiumService;
import com.cosbaseBallTest.web.dto.CMRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;
	
	@GetMapping("/stadium/joinForm")
	public String joinFrom() {
		return "join/stadiumjoin"; //jsp
	}
	
	@PostMapping("/stadium/join")
	public String join(Stadium stadium) {
		stadiumService.구장등록(stadium);
		return "redirect:/";
	}  
	
	@GetMapping("/stadium/listForm")
	public String listForm(Model model) {
		List<Stadium> stadiums = stadiumService.구장목록();
		model.addAttribute("stadiums", stadiums);
		return "list/stadiumlist";
	}
	@DeleteMapping("/stadium/{id}")
	public @ResponseBody CMRespDto<?> deleteById(@PathVariable int id) {
		stadiumService.삭제하기(id);
		return new CMRespDto<>(1,null);
	}
}
