package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

}
