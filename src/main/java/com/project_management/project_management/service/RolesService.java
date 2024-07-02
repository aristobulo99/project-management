package com.project_management.project_management.service;

import com.project_management.project_management.model.DTOs.RolesDTO;
import com.project_management.project_management.model.Role;
import com.project_management.project_management.model.User;
import com.project_management.project_management.repository.RolesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<RolesDTO> getAllRoles(){
        List<Role> roles = rolesRepository.findAll();
        return roles.stream()
                .map(role -> modelMapper.map(role, RolesDTO.class))
                .collect(Collectors.toList());
    }

    public RolesDTO createRoles(RolesDTO rolesDTO){
        Role role = modelMapper.map(rolesDTO, Role.class);
        rolesRepository.save(role);
        return modelMapper.map(role, RolesDTO.class);
    }
}
