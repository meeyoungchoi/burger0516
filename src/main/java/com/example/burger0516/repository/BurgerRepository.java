package com.example.burger0516.repository;

import com.example.burger0516.vo.Burger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BurgerRepository extends CrudRepository<Burger, Integer> {

    @Override
    List<Burger> findAll();
}
