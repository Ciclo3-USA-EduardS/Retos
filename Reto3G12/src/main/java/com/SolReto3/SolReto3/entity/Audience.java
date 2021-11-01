/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SolReto3.SolReto3.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author eduar
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "audiences")
public class Audience implements Serializable{
    @Id
    private int id;
    private int category;
    private String owner;
    private String name;
    private int capacity;
    private String descripcion;
    
}
