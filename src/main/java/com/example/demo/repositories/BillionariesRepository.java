package com.example.demo.repositories;

import com.example.demo.models.Billionary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillionariesRepository extends JpaRepository <Billionary,Integer> {


}
