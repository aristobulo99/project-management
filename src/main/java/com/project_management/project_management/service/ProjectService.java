package com.project_management.project_management.service;

import com.project_management.project_management.model.DTOs.ProjectDTO;
import com.project_management.project_management.model.Project;
import com.project_management.project_management.repository.ProjectRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ProjectDTO> getAllProjects(){
        List<Project> projects = projectRepository.findAll();
        return  projects.stream()
                .map(project -> modelMapper.map(project, ProjectDTO.class))
                .collect(Collectors.toList());
    }

    public ProjectDTO createProject(ProjectDTO projectDTO){
        Project project = modelMapper.map(projectDTO, Project.class);
        projectRepository.save(project);
        return modelMapper.map(project, ProjectDTO.class);
    }

}
