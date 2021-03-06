package com.management.HumanResources.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int salary;
    private String position;
    private Address address;
    private long managerID;
    private String dept;
    private String phoneNumber;
    private String emergencyName;
    private String emergencyNumber;

    @JsonIgnore
    public String getUniqueData() {
        return (new String(firstName+lastName+email)).toLowerCase();
    }

    public void merge(Employee updatedEmployee) {
        this.firstName = updatedEmployee.getFirstName() == null ? this.firstName : updatedEmployee.getFirstName();
        this.lastName = updatedEmployee.getLastName() == null ? this.lastName : updatedEmployee.getLastName();
        this.email = updatedEmployee.getEmail() == null ? this.email : updatedEmployee.getEmail();
        this.salary = updatedEmployee.getSalary() == 0 ? this.salary : updatedEmployee.getSalary();
        this.position = updatedEmployee.getPosition() == null ? this.position : updatedEmployee.getPosition();
        this.address = updatedEmployee.getAddress() == null ? this.address : updatedEmployee.getAddress();
        this.managerID = updatedEmployee.getManagerID() == 0 ? this.managerID : updatedEmployee.getManagerID();
        this.dept = updatedEmployee.getDept() == null ? this.dept : updatedEmployee.getDept();
        this.phoneNumber = updatedEmployee.getPhoneNumber() == null ? this.phoneNumber : updatedEmployee.getPhoneNumber();
        this.emergencyName = updatedEmployee.getEmergencyName() == null ? this.emergencyName : updatedEmployee.getEmergencyName();
        this.emergencyNumber = updatedEmployee.getEmergencyNumber() == null ? this.emergencyNumber : updatedEmployee.getEmergencyNumber();
      }

}