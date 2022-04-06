package com.example.crud.controller;

import com.example.crud.model.Employee;
import com.example.crud.repository.AddressRepository;
import com.example.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/getEmployee")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
    @PostMapping("/save")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return ResponseEntity.ok("Data saved");
    }

    @GetMapping("getById/{id}")
    public Optional<Employee> getEmployeeByIs(@PathVariable Long id){
        return  employeeRepository.findById(id);

    }

    @DeleteMapping("deleteById/{id}")
    public  void  deleteById(@PathVariable Long id ){
        employeeRepository.deleteById(id);
    }


}
