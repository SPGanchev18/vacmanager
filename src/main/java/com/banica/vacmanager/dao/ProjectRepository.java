package com.banica.vacmanager.dao;

import com.banica.vacmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {


}