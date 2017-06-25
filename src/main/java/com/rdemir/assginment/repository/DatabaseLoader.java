package com.rdemir.assginment.repository;

import com.rdemir.assginment.entity.Department;
import com.rdemir.assginment.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public void run(String... strings) throws Exception {
        departmentRepository.save(new Department(1L,"Engineering","This is engineering description"));

        departmentRepository.save(new Department(2L,"Design","This is design description"));

        departmentRepository.save(new Department(3L,"engineering&design","This is engineering&design description"));

        repository.save(new Employee(1L,"ramazan","demir",1200,1L));

//        repository.save(new Employee(2L,"ramazan","demir",2200,2L));
//
//        repository.save(new Employee(3L,"ramazan","demir",3200,3L));
    }
}
