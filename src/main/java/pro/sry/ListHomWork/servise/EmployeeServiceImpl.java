package pro.sry.ListHomWork.servise;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee>employeeList = new ArrayList<>(List.of(
            new Employee(
                    "Table",
                    8450.0,
                    1),

            new Employee(
                    "Chair",
                    990,
                    2),

            new Employee(
                    "Bed",
                    11450.0,
                    3),

            new Employee(
                    "Sofa",
                    9453.0,
                    4),

            new Employee(
                    "Cupboard",
                    16700.0,
                    5)
    ));
    List<Employee>e = new ArrayList<>();
    @Override
    public  List<Employee> addEmployee(List employeeList) {

        e.add(Employee.getID());
        e.add(Employee.getNameProduct());
        e.add(Employee.getPriceProduct());
        return e;
    }

    @Override
    public List<Employee> get(List e) {
        return e;
    }
}
