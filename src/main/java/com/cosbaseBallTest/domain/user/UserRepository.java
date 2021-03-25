package com.cosbaseBallTest.domain.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>{
//	@Query(value = "select u.id, u.username, u.position, t.teamname from user u inner join team t on u.userId = t.id",nativeQuery = true)
//	List<User> findByuserAll(); 
}
