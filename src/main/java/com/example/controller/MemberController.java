package com.example.controller;

import com.example.Repository.MemberRepository;
import com.example.domain.Member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@RequestMapping("{memberId}")
	public Member getMember(@PathVariable Long memberId){
		
		Member member = memberRepository.findOne(memberId);
		return member;
	}
	@RequestMapping("/add")
	public Member addMember( @RequestParam(value="memberName") String memberName){
		Member member = new Member(memberName);
		memberRepository.save(member);
		return member;
	}
	
		
}
