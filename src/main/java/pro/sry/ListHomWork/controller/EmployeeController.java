package pro.sry.ListHomWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sry.ListHomWork.servise.Employee;
import pro.sry.ListHomWork.servise.EmployeeService;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String name, @RequestParam String surName) {
        return service.add(name, surName);
    }
    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String name, @RequestParam String surName) {
        return service.remove(name, surName);
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String name, @RequestParam String surName) {
        return service.find(name, surName);
    }
    @GetMapping("/findAll")
    public List<Employee> findAll() {
        return service.findAll();
    }
}
