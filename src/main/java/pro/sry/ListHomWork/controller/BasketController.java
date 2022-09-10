package pro.sry.ListHomWork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sry.ListHomWork.servise.Basket;
import pro.sry.ListHomWork.servise.BasketService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService employeeService;


    public BasketController(BasketService EmployeeService) {
        this.employeeService = EmployeeService;
    }

    @GetMapping("/add")
    public List<Basket> addEmployee(@RequestParam("ID") List<Integer> ID) {
    return ID.stream().flatMap(integer -> employeeService.addEmployee(integer).stream()).collect(Collectors.toList());

    }

    @GetMapping("/get")
    public List<Basket> get() {
        return employeeService.get();
    }
}
