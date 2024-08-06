package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {//objtype,primary key data type

}
