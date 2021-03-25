package com.cosbaseBallTest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cosbaseBallTest.domain.user.User;
import com.cosbaseBallTest.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	 
	private final UserRepository userRepository;
	
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

}
