package com.cosbaseBallTest.domain.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cosbaseBallTest.domain.stadium.Stadium;
import com.cosbaseBallTest.domain.team.Team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer id;
	   private String username;
	   private String position;
	   
	   @ManyToOne
	   @JoinColumn(name="teamId")
	   private Team team;
	   
}
