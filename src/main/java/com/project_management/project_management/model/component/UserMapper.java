package com.project_management.project_management.model.component;

import com.project_management.project_management.model.DTOs.ProjectDTO;
import com.project_management.project_management.model.DTOs.RolesDTO;
import com.project_management.project_management.model.DTOs.UserDTO;
import com.project_management.project_management.model.Project;
import com.project_management.project_management.model.Role;
import com.project_management.project_management.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    @Lazy
    private ProjectMapper projectMapper;

    public UserDTO toUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        Set<RolesDTO> roleDTOs = user.getRoles().stream()
                .map(roleMapper::toRoleDTO)
                .collect(Collectors.toSet());
        userDTO.setRoles(roleDTOs);

        Set<ProjectDTO> projectDTOS = user.getProject().stream()
                .map(projectMapper::toProjectDTO)
                .collect(Collectors.toSet());
        userDTO.setProject(projectDTOS);

        return userDTO;
    }

    public User toUser(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        Set<Role> roles = userDTO.getRoles().stream()
                .map(roleMapper::toRole)
                .collect(Collectors.toSet());
        user.setRoles(roles);
        Set<Project> projects = userDTO.getProject().stream()
                .map(projectMapper::toProject)
                .collect(Collectors.toSet());
        user.setProject(projects);

        return user;
    }
}
