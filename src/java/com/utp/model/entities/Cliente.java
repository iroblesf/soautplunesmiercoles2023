/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.model.entities;

/**
 *
 * @author Admin
 */
//Patrón Creacional
public class Cliente {
   
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", celular=" + celular + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public static class Builder{
           private Cliente cliente;
           
           public Builder(){
              this.cliente = new Cliente();
           }
    
           public Builder id(String id){
              cliente.id = id;
              return this;
           }
           public Builder nombre(String nombre){
              cliente.nombre = nombre;
              return this;
           }
           public Builder apellido(String apellido){
              cliente.apellido = apellido;
              return this;
           }
           public Builder correo(String correo){
              cliente.correo = correo;
              return this;
           }
           public Builder celular(String celular){
              cliente.celular = celular;
              return this;
           }
    
           public Cliente build(){
              return cliente;
           }
           
    }
    
}
