package com.cosbaseBallTest.domain.team;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.cosbaseBallTest.domain.stadium.Stadium;
import com.cosbaseBallTest.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String teamname;
	
	@OneToOne
	@JoinColumn(name = "stadiumId")
	private Stadium stadium;
	
	@OneToMany(mappedBy = "team")
	private List<User> user;
}
