/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.utp.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "Operacion")
public class Operacion {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "suma")
    public Double suma(@WebParam(name = "numero1") Double numero1, @WebParam(name="numero2") Double numero2) {
        return  numero1+numero2;
    }
    
      @WebMethod(operationName = "resta")
    public Double resta(@WebParam(name = "numero1") Double numero1, @WebParam(name="numero2") Double numero2) {
       
        if(numero1>numero2){
        return  numero1-numero2;
        }else{
        return numero2-numero1;
        }
        
        
    }
}
