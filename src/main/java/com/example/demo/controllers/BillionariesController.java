package com.example.demo.controllers;

import com.example.demo.models.Billionary;
import com.example.demo.repositories.BillionariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/billionaries")
public class BillionariesController {

    @Autowired
    private BillionariesRepository billionariesRepository;

    @GetMapping("")
    public List<Billionary> findAll(){
        return billionariesRepository.findAll();
    }

    @PostMapping("")
    public void save(Billionary billionary){
        billionariesRepository.save(billionary);
    }


}
