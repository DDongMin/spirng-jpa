package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.MemberRepository;
import com.example.Repository.TeamRepository;
import com.example.domain.Member;
import com.example.domain.Team;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@RequestMapping("{teamId}")
	public Team getTeam(@PathVariable Long teamId){
		Team team = teamRepository.findOne(teamId);
	//	Member member = team.getMember();
		return team;
	}
	
	@RequestMapping("add/{memberId}")
	public Team addTeam(@PathVariable Long memberId , @RequestParam(value="teamName") String teamName){
		Member member = memberRepository.findOne(memberId);
		Team team = teamRepository.save(new Team(member , teamName));
		return team;
	}
}
