package com.compass.course.services;

import com.compass.course.entities.Order;
import com.compass.course.repositories.OrderRepository;
import com.compass.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
//        Optional<Order> obj = orderRepository.findById(id);
//        return obj.get();
        return orderRepository.findById(id).get();
    }
}
