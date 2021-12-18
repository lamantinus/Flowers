package com.example.flowers.services;

import com.example.flowers.entities.Basket;

import java.util.List;

public interface OrderService {
    List<Basket> getNotCompletedOrders();
    void complete(int basketId);
}

