package com.cosbaseBallTest.domain.stadium;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.cosbaseBallTest.domain.team.Team;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity 
public class Stadium {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer id;
	   private String stadiumname;
	   
	   @OneToOne(mappedBy = "stadium",cascade = CascadeType.REMOVE)
	   //스타디움을 삭제하면 팀을 삭제하겠다. / 부모를 삭제하면 자식이 삭제됨.
	   //삭제시 연관된 데이터도 함께 삭제됨.
	   private Team team; 
}
