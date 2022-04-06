package com.example.crud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="address_table")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="add_id")
    private Long addressId;
    @Column(name="city")
    private String city;
    @Column(name="add_type")
    private String addressType;
    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private Employee employee;

    public Address()
    {

    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Address(Long addressId, String city, String addressType, Employee employee) {
        this.addressId = addressId;
        this.city = city;
        this.addressType = addressType;
        this.employee = employee;
    }



}
