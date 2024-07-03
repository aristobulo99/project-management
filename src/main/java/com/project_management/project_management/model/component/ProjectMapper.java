package com.project_management.project_management.model.component;

import com.project_management.project_management.model.DTOs.ProjectDTO;
import com.project_management.project_management.model.DTOs.UserDTO;
import com.project_management.project_management.model.Project;
import com.project_management.project_management.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.stream.Collectors;

public class ProjectMapper {

    @Autowired
    private UserMapper userMapper;

    public ProjectDTO toProjectDTO(Project project){
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(project.getId());
        projectDTO.setName(project.getName());
        projectDTO.setDescription(project.getDescription());
        projectDTO.setStartDate(project.getStartDate());
        projectDTO.setEndingDate(project.getEndingDate());
        Set<UserDTO> userDTOS = project
                .getUser()
                .stream()
                .map(userMapper::toUserDTO)
                .collect(Collectors.toSet());
        projectDTO.setUser(userDTOS);
        return projectDTO;
    }

    public Project toProject(ProjectDTO projectDTO){
        Project project = new Project();
        project.setId(projectDTO.getId());
        project.setName(projectDTO.getName());
        project.setDescription(projectDTO.getDescription());
        project.setStartDate(projectDTO.getStartDate());
        project.setEndingDate(projectDTO.getEndingDate());
        Set<User> users = projectDTO
                .getUser()
                .stream()
                .map(userMapper::toUser)
                .collect(Collectors.toSet());
        project.setUser(users);
        return project;
    }
}
