package com.example.main.Repositary;											

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.Entities.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {		//JPARepository Gives us all the CRUD Operations method InBuilt
	
}
