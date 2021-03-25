package com.cosbaseBallTest.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cosbaseBallTest.domain.team.Team;
import com.cosbaseBallTest.domain.user.User;
import com.cosbaseBallTest.service.TeamService;
import com.cosbaseBallTest.web.dto.CMRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamService teamService;
	
	@GetMapping("/team/joinForm")
	public String joinFrom() {
		return "join/teamjoin"; //jsp
	}
	
	@PostMapping("/team/join")
	public String join(Team team) {
		teamService.팀등록(team);
		return "redirect:/";
	}
	
	@GetMapping("/team/listForm")
	public String listForm(Model model) {
		List<Team> teams = teamService.팀목록();
		model.addAttribute("teams", teams);
		return "list/teamlist";
	}
	@DeleteMapping("/team/{id}")
	public @ResponseBody CMRespDto<?> deleteById(@PathVariable int id) {
		teamService.삭제하기(id);
		return new CMRespDto<>(1,null);
	}
}
