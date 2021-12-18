package com.example.flowers.controllers;

import com.example.flowers.repositories.CountryRepository;
import com.example.flowers.auth.UserDetailsImpl;
import com.example.flowers.entities.*;
import com.example.flowers.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public String get() {
        return "user";
    }

    @PostMapping
    void post(@AuthenticationPrincipal UserDetailsImpl userDetails, @ModelAttribute("address") Address address) {
        userService.setAddress(userDetails.getUser(), address);
    }

    @ModelAttribute("countries")
    public List<Country> getCountries() {
        return countryRepository.getCountries();
    }

    @ModelAttribute("address")
    public Address getAddress(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        return userService.getAddress(userDetails.getUser());
    }

    @ModelAttribute("user")
    public User getUser(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        return userDetails.getUser();
    }

    @ModelAttribute("orders")
    public List<Basket> getOrders(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        return userService.getOrders(userDetails.getUser());
    }
}
