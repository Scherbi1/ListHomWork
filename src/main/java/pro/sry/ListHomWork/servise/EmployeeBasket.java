package pro.sry.ListHomWork.servise;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class EmployeeBasket {
  private final  List<Basket> e=new ArrayList<>();

  public List<Basket> add (Basket employee) {
      e.add(employee);
      return e;
  }

    public List<Basket> getBasket() {
      return e;
    }
}
