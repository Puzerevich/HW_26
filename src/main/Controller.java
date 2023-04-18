package main;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")

public class Controller {
    private OrderRepository orderRepository;

    public Controller() {
        orderRepository = new OrderRepository();
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderRepository.getOrderById(id);
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @PostMapping("/orders")
    public void addOrder(@RequestBody Order order) {
        orderRepository.addOrder(order);
    }
}