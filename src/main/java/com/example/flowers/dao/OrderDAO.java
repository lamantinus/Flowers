package com.example.flowers.dao;

import com.example.flowers.entities.Basket;

import java.util.List;

public interface OrderDAO {
    List<Basket> getNotCompletedOrders();
    void complete(int basketId);
}

