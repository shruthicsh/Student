package com.example.crud.repository;

import com.example.crud.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long>

{

}
