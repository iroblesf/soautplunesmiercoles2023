/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.test;

import com.utp.model.entities.Cliente;

/**
 *
 * @author Admin
 */
public class TestCliente {
 
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente.Builder()
                .id("id")
                .build();
        
        System.out.println(""+cliente);
    }
    
    
}
