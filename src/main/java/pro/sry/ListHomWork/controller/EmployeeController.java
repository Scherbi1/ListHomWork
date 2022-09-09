package pro.sry.ListHomWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sry.ListHomWork.servise.Employee;
import pro.sry.ListHomWork.servise.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/store")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = EmployeeService;
    }

    @GetMapping("/order/add")
    public Integer addEmployee(@RequestParam("ID") Integer ID) {
        return EmployeeService.addEmployee(ID);
    }
    @GetMapping("/order/get")
    public Employee get(List e) {
        return EmployeeService.get(e);
    }
}
