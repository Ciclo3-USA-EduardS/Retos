/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SolReto3.SolReto3.repository;

import com.SolReto3.SolReto3.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author eduar
 */
public interface ScoreReservation extends JpaRepository<Score, Integer>{
    
}
