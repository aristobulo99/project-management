package com.project_management.project_management.model.component;

import com.project_management.project_management.model.DTOs.RolesDTO;
import com.project_management.project_management.model.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    public RolesDTO toRoleDTO(Role role) {
        RolesDTO roleDTO = new RolesDTO();
        roleDTO.setId(role.getId());
        roleDTO.setName(role.getName());
        return roleDTO;
    }

    public Role toRole(RolesDTO roleDTO) {
        Role role = new Role();
        role.setId(roleDTO.getId());
        role.setName(roleDTO.getName());
        return role;
    }
}
