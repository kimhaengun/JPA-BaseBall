package com.cosbaseBallTest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cosbaseBallTest.domain.stadium.Stadium;
import com.cosbaseBallTest.domain.stadium.StadiumRepository;
import com.cosbaseBallTest.domain.team.Team;
import com.cosbaseBallTest.domain.team.TeamRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StadiumService {
	private final StadiumRepository stadiumRepository;
	
	@Transactional
	public void 구장등록(Stadium stadium) {
		stadiumRepository.save(stadium);
	}
	
	@Transactional(readOnly = true)
	public List<Stadium> 구장목록() {
		return stadiumRepository.findAll(); 
	}
	@Transactional
	public void 삭제하기(int id) {
		stadiumRepository.deleteById(id);

	}
}
