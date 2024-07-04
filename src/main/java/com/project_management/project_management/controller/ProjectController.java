package com.project_management.project_management.controller;

import com.project_management.project_management.model.DTOs.ProjectDTO;
import com.project_management.project_management.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<ProjectDTO> getAllProjects(){
        return projectService.getAllProjects();
    }

    @PostMapping
    public ResponseEntity<ProjectDTO> createProject(@RequestBody ProjectDTO projectDTO){
        ProjectDTO createProjectDOT = projectService.createProject(projectDTO);
        return new ResponseEntity<>(createProjectDOT, HttpStatus.CREATED);
    }
}
