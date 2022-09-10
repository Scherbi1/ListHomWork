package pro.sry.ListHomWork.servise;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BasketServiceImpl implements BasketService {
    List<Basket>employeeList = new ArrayList<>(List.of(
            new Basket(
                    "Table",
                    8450.0,
                    1),

            new Basket(
                    "Chair",
                    990,
                    2),

            new Basket(
                    "Bed",
                    11450.0,
                    3),

            new Basket(
                    "Sofa",
                    9453.0,
                    4),

            new Basket(
                    "Cupboard",
                    16700.0,
                    5)
    ));
 private final EmployeeBasket employeeBasket;

    public BasketServiceImpl(EmployeeBasket employeeBasket) {
        this.employeeBasket = employeeBasket;
    }

    @Override
    public  List<Basket> addEmployee(Integer ID) {

        return employeeBasket.add(employeeList.stream().
                filter(employee -> employee.getID()==ID).findFirst().orElseThrow(IllegalArgumentException::new));
    }

    @Override
    public List<Basket> get() {
        return employeeBasket.getBasket();
    }
}
