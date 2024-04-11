package com.challenge.coursechallenge1;

import com.challenge.entities.Order;
import com.challenge.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan({"com.challenge"})
public class CourseChallenge1Application implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(CourseChallenge1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order ordr1 = new Order(1034, 150.00, 20.0);
        Order ordr2 = new Order(2282, 800.00, 10.0);
        Order ordr3 = new Order(1309, 95.90, 0.0);

        List<Order> orders = new ArrayList<>();
        orders.add(ordr1);
        orders.add(ordr2);
        orders.add(ordr3);

        for (Order order : orders) {
            System.out.println("Pedido código: " + order.getCode());
            System.out.println("Valor total: R$" + orderService.total(order));
        }
    }

}
