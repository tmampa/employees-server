package com.tmampa.employersys.repositories;

import com.tmampa.employersys.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, String> {
}
