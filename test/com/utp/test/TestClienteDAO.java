/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.test;

import com.utp.model.daos.ClienteDAO;
import com.utp.model.entities.Cliente;

/**
 *
 * @author Admin
 */
public class TestClienteDAO {
    public static void main(String[] args) {
        
//        Cliente cliente = new Cliente.Builder()
//                .nombre("Prueba2")
//                .apellido("Prueba2")
//                .celular("Prueba2")
//                .correo("Prueba2")
//                .build();
//        
      ClienteDAO clienteDAO = new ClienteDAO();
      
      Cliente cliente = clienteDAO.listarPorCorreo("Prueba");
      
        if (cliente!=null) {
            System.out.println(""+cliente);
        } else {
            System.out.println("No se encontro el registro");
        }
      
//        if (clienteDAO.insert(cliente)) {
//            System.out.println("OK");
//        } else {
//            System.out.println("No OK");
//        }
            
////        //Listando los objetos
////        
////        for (Cliente cliente1 : clienteDAO.list()) {
////            System.out.println("1"+cliente1);
////        }
////        
        
    }
}
