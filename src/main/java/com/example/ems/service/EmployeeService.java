package com.example.ems.service;

import com.example.ems.entity.Employee;
import com.example.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public Employee update(Long id, Employee emp) {
        Employee e = repo.findById(id).orElseThrow();
        e.setFirstName(emp.getFirstName());
        e.setLastName(emp.getLastName());
        e.setEmail(emp.getEmail());
        e.setSalary(emp.getSalary());
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}