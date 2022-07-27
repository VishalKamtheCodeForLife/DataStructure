package com.example.department.controller;

import com.example.department.service.DepartmentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Data
@RequestMapping(value = "/departments")
public class DepartmentController {
    @Qualifier("departmentService")
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}/{name}")
    public String getDepartment(@PathVariable("id")  int id,@PathVariable("name") String name){
        return "Department return";
    }

    @PostMapping("/")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        return ResponseEntity.ok(department);
    }
}
