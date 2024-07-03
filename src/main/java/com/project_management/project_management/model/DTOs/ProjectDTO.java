package com.project_management.project_management.model.DTOs;

import com.project_management.project_management.model.User;

import java.util.Date;
import java.util.Set;

public class ProjectDTO {

    private Long id;
    private String name;
    private String description;
    private Date startDate;
    private Date endingDate;
    private Set<UserDTO> user;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public Set<UserDTO> getUser() {
        return user;
    }

    public void setUser(Set<UserDTO> user) {
        this.user = user;
    }
}
