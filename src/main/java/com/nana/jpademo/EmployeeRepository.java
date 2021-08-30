package com.nana.jpademo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
 List<Employee> findEmployeeByLastNameContaining(String str);

}
