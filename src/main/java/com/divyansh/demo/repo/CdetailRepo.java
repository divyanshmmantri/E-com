package com.divyansh.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.divyansh.demo.model.Cdetail;



public interface CdetailRepo extends JpaRepository<Cdetail,Integer> {
     List<Cdetail>findByName(String name);
}

