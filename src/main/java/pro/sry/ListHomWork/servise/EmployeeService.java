package pro.sry.ListHomWork.servise;

import java.util.List;

public interface EmployeeService {
    Employee add(String name, String surName);
    Employee remove(String name, String surName);
    Employee find(String name, String surName);

    List<Employee> findAll();
}
