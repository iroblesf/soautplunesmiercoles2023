/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utp.model.interfaces;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface ICRUD<T> {

    Boolean insert(T t);

    Boolean update(T t);

    List<T> list();

    T listById(Object id);

    void delete(Object id);

}
