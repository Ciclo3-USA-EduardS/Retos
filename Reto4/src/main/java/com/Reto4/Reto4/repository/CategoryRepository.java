/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Reto4.Reto4.repository;


import com.Reto4.Reto4.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author eduar
 */
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
