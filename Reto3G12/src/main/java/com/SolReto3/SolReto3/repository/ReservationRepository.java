/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SolReto3.SolReto3.repository;

import com.SolReto3.SolReto3.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author eduar
 */
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
    
}
