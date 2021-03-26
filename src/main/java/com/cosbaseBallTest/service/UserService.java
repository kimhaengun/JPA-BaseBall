package com.cosbaseBallTest.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.qlrm.mapper.JpaResultMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cosbaseBallTest.domain.user.User;
import com.cosbaseBallTest.domain.user.UserRepository;
import com.cosbaseBallTest.web.dto.UserPositionRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	 
	private final UserRepository userRepository;
	private final EntityManager entityManager;
	
	@Transactional
	public User 선수등록(User user) {
		return userRepository.save(user);
	}
	
	@Transactional(readOnly = true)
	public List<User> 선수목록() {
		return userRepository.findAll(); 
	}
	@Transactional
	public void 삭제하기(int id) {
		userRepository.deleteById(id);

	}
	
	@Transactional(readOnly = true)
	public List<UserPositionRespDto> 포지션선수리스트() {
		StringBuffer sb = new StringBuffer();
		sb.append("select position, ");
		sb.append("MAX(if(teamId =1, username, \"\")) LOTTE, ");
		sb.append("MAX(if(teamId =2, username, \"\")) HANWHA, ");
		sb.append("MAX(if(teamId =3, username, \"\")) SAMSUNG ");
		sb.append("from user ");
		sb.append("group by position;");
		Query q = entityManager.createNativeQuery(sb.toString());
		
		JpaResultMapper result = new JpaResultMapper();
		List<UserPositionRespDto> userPositionRespDto = result.list(q, UserPositionRespDto.class);
		return userPositionRespDto;
	}

}
