package main;

import java.util.Date;
import java.util.List;

public class Order {

    private int id;
    private Date date;
    private double cost;
    private List<Product> products;

    public Order(int id, Date date, double cost, List<Product> products) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getCost() {
        return cost;
    }

    public List<Product> getProducts() {
        return products;
    }
}
