package com.example.crud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="emp_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private Long empId;
    @Column(name="emp_name")
    private String empName;
    @Column(name="emp_age")
    private Integer empAge;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_add_id")
    @JsonIgnore
    private Address address;
    public Employee()
    {

    }

    public Employee(Long empId, String empName, Integer empAge, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.address = address;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}