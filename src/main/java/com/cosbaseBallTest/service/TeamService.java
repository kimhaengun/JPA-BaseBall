package com.cosbaseBallTest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cosbaseBallTest.domain.team.Team;
import com.cosbaseBallTest.domain.team.TeamRepository;
import com.cosbaseBallTest.domain.user.User;
import com.cosbaseBallTest.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TeamService {
	
	private final TeamRepository teamRepository;
	
	@Transactional
	public void 팀등록(Team team) {
		teamRepository.save(team);
	}
	
	@Transactional(readOnly = true)
	public List<Team> 팀목록() {
		return teamRepository.findAll(); 
	}
	@Transactional
	public void 삭제하기(int id) {
		teamRepository.deleteById(id);

	}
}
