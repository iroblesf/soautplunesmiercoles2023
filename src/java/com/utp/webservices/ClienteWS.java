/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.utp.webservices;

import com.utp.model.daos.ClienteDAO;
import com.utp.model.entities.Cliente;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "ClienteWS")
public class ClienteWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "insert")
    public Boolean insert(@WebParam(name = "nombre") String nombre,@WebParam(name = "apellido") String apellido,@WebParam(name = "correo") String correo,@WebParam(name = "celular") String celular) {
          
        Cliente cliente = new Cliente.Builder()
                .nombre(nombre)
                .apellido(apellido)
                .celular(celular)
                .correo(correo)
                .build();
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.insert(cliente);
    }
    @WebMethod(operationName = "list")
    public List<Cliente> list(){
        ClienteDAO clienteDAO = new ClienteDAO();
        return  clienteDAO.list();
    }
    
    @WebMethod(operationName="listByEmail")
    public Cliente listByEMail(@WebParam(name="correo")String correo){
     ClienteDAO clienteDAO = new ClienteDAO();
     return  clienteDAO.listarPorCorreo(correo);
    
    }
    
}
