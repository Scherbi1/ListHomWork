package pro.sry.ListHomWork.servise;

import org.springframework.stereotype.Service;
import pro.sry.ListHomWork.exceptions.EmployeeNotFoundException;
import pro.sry.ListHomWork.exceptions.EmployeeAlreadyAddedException;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList;

    public EmployeeServiceImpl(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public Employee add(String name, String surName) {
        Employee employee = new Employee(name, surName);

        if (!employeeList.add(employee)) {
            throw new EmployeeAlreadyAddedException("Сотрудник есть уже в базе");
        } else {
            System.out.println("Сотрудник успешно добавлен");
            return employee;
        }
    }

    @Override
    public Employee remove(String name, String surName) {
        Employee employee = new Employee(name,surName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            System.out.print("Сотрудник успешно удален из базы данных");
            return employee;
        }
          throw new EmployeeNotFoundException("Сотрудник успешно удален из базы");

    }

    @Override
    public  Employee find(String name, String surName)  {
        Employee employee = new Employee(name,surName);
        if (employeeList.contains(employee)) {
            return employee;
        } else {
            throw new EmployeeNotFoundException("Сотрудник в базе не найдет");
        }
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

}