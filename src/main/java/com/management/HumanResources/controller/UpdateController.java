package com.management.HumanResources.controller;

import com.management.HumanResources.model.*;
import com.management.HumanResources.service.UpdateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/update")
public class UpdateController {

    @Autowired private UpdateService updateService;

    @PatchMapping(path = "/employee")
    public ResponseEntity<String> updateExistingEmployee(@RequestBody Employee employee) {
        return updateService.updateEmployeeInfo(employee);
    }
}