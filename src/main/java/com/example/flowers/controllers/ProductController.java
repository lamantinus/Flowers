package com.example.flowers.controllers;

import com.example.flowers.auth.UserDetailsImpl;
import com.example.flowers.entities.Product;
import com.example.flowers.entities.ProductCategory;
import com.example.flowers.entities.ProductMaterial;
import com.example.flowers.entities.User;
import com.example.flowers.services.ProductServiceImpl;
import com.example.flowers.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping
public class ProductController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping(value = "/products")
    public String get() {
        return "products";
    }

    @PostMapping(value = "/products")
    String createProduct(HttpServletRequest request, @ModelAttribute("product") Product product) {
        productService.add(product);
        return "redirect:" + request.getHeader("Referer");
    }

    @PostMapping(value = "/products/buy/{id}")
    String buy(HttpServletRequest request, @AuthenticationPrincipal UserDetailsImpl userDetails, @PathVariable int id) {
        userService.buy(userDetails.getUser(), id);
        return "redirect:" + request.getHeader("Referer");
    }

    @ModelAttribute("user")
    public User getUser(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        if (userDetails == null) {
            return null;
        }

        return userDetails.getUser();
    }

    @ModelAttribute("product")
    public Product getProduct() {
        return new Product();
    }

    @ModelAttribute("products")
    public List<Product> getProducts(@RequestParam(name = "category", required = false) ProductCategory category) {
        return productService.getProducts(category);
    }

    @ModelAttribute("productCategories")
    public List<ProductCategory> getProductCategories() {
        return productService.getProductCategories();
    }

    @ModelAttribute("productMaterials")
    public List<ProductMaterial> getProductMaterials() {
        return productService.getProductMaterials();
    }
}
