package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Member;



public interface MemberRepository extends CrudRepository<Member, Long> {

}
