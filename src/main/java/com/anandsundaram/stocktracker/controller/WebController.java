package com.anandsundaram.stocktracker.controller;

import com.anandsundaram.stocktracker.model.UserStock;
import com.anandsundaram.stocktracker.repository.UserStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class WebController {

    @Autowired
    private UserStockRepository repository;

    @GetMapping
    List<UserStock> getAll (){
        return repository.findAll();
    }

    @PostMapping
    String postStock(@RequestBody UserStock stock){
        repository.insert(stock);
        return "Inserted";
    }
}
