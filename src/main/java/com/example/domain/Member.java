package com.example.domain;

import java.util.List;

import javax.persistence.*;


@Entity
public class Member  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;
    

    @OneToMany
    @JoinColumn(name = "member_id" , referencedColumnName="id")  // @ManyToOne의 fetch 기본전략은 EAGER이다.
    private List<Team> teamList;

    public Member(){
    }
    public Member(String name){
    	this.name = name;
    }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Team> getTeamList() {
		return teamList;
	}
	public void setTeamList(List<Team> teamList) {
		this.teamList = teamList;
	}
    

}
