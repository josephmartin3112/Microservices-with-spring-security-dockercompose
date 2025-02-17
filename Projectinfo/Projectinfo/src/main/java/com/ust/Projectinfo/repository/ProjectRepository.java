package com.ust.Projectinfo.repository;

import com.ust.Projectinfo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByCcode(Long ccode);
}
