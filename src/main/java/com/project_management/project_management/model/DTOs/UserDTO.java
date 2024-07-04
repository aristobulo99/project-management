package com.project_management.project_management.model.DTOs;

import java.util.Set;

public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Set<RolesDTO> roles;
    private Set<ProjectDTO> project;

    public UserDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RolesDTO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RolesDTO> roles) {
        this.roles = roles;
    }

    public Set<ProjectDTO> getProject() {
        return project;
    }

    public void setProject(Set<ProjectDTO> project) {
        this.project = project;
    }
}
