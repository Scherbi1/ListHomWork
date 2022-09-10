package pro.sry.ListHomWork.servise;

import java.util.Objects;

public class Basket {
    private String nameProduct;
    private double priceProduct;
    private int ID;

    public Basket(String nameProduct, double priceProduct, int ID) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.ID = ID;
    }



    public String getNameProduct() {
        return nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public int getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket employee = (Basket) o;
        return Double.compare(employee.priceProduct, priceProduct) == 0 && ID == employee.ID && nameProduct.equals(employee.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, priceProduct, ID);
    }

    @Override
    public String toString() {
        return " Код продукт " + ID+
                " Продукт " + nameProduct +
                " Цена " + priceProduct + " " ;
    }
}




