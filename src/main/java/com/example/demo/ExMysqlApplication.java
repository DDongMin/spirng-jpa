package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExMysqlApplication.class, args);
		
//		MemberRepository memberRepository = context.getBean(MemberRepository.class);
//		
//		memberRepository.save(new Member("µ¿¹Î"));
//		memberRepository.save(new Member("±âÈ«"));
	}
}
