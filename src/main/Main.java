package main;

import java.util.ArrayList;
import java.util.Date;

public class Main{
    public static void main(String[] args) {
        ArrayList<Object> orders = new ArrayList<>();
        Order ord1 = new Order(1, new Date(), 15.0, new ArrayList<>());
        Order ord2 = new Order(2, new Date(), 22.0, new ArrayList<>());
        orders.add(ord1);
        orders.add(ord2);
    }
}
