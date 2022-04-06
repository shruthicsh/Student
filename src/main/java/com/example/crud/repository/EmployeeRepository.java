package com.example.crud.repository;

import com.example.crud.model.Address;
import com.example.crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

}
