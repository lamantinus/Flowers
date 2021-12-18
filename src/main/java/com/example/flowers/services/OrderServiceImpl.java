package com.example.flowers.services;

import com.example.flowers.dao.OrderDAOImpl;
import com.example.flowers.entities.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAOImpl orderDAO;

    @Override
    public List<Basket> getNotCompletedOrders() {
        return orderDAO.getNotCompletedOrders();
    }

    @Override
    public void complete(int basketId) {
        orderDAO.complete(basketId);
    }
}
