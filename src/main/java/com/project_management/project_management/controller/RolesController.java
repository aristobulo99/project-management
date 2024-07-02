package com.project_management.project_management.controller;

import com.project_management.project_management.model.DTOs.RolesDTO;
import com.project_management.project_management.model.Role;
import com.project_management.project_management.model.User;
import com.project_management.project_management.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesService rolesService;

    @GetMapping
    public List<RolesDTO> getAllRole(){
        return rolesService.getAllRoles();
    }

    @PostMapping
    public ResponseEntity<RolesDTO> createRole(@RequestBody RolesDTO rolesDTO){
        RolesDTO createRolesDTO = rolesService.createRoles(rolesDTO);
        return new ResponseEntity<>(createRolesDTO, HttpStatus.CREATED);
    }
}
