package com.example.flowers.controllers;

import com.example.flowers.auth.UserDetailsImpl;
import com.example.flowers.entities.*;
import com.example.flowers.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/basket")
public class BasketController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public String get() {
        return "basket";
    }

    @ModelAttribute("user")
    public User getUser(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        if (userDetails == null) {
            return null;
        }

        return userDetails.getUser();
    }

    @ModelAttribute("basket")
    public Basket getBasket(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        if (userDetails == null) {
            return null;
        }

        return userService.getBasket(userDetails.getUser());
    }

    @ModelAttribute("total")
    public int getTotal(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        if (userDetails == null) {
            return 0;
        }

        Basket basket = userService.getBasket(userDetails.getUser());

        if (basket == null) {
            return 0;
        }

        int total = 0;

        for (int i = 0; i < basket.getBasketItems().size(); i++) {
            BasketItem basketItem = basket.getBasketItems().get(i);

            total += basketItem.getQuantity() * basketItem.getProduct().getPrice();
        }

        return total;
    }
}
