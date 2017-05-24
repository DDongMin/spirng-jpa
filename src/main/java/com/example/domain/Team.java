package com.example.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JsonBackReference
	private Member member;
	
	@Column
	private String teamName;
	
	public Team(){
	}
	
	public Team(Member member , String teamName){
		this.member = member;
		this.teamName = teamName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
}
