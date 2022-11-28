package com.banica.vacmanager.dao;

import com.banica.vacmanager.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {


}