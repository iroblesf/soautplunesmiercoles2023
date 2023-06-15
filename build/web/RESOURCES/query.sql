/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Admin
 * Created: 12 jun. 2023
 */


CREATE DATABASE SOA2023
GO
USE SOA2023
GO
CREATE TABLE CLIENTE(
id int identity(1,1) not null primary key,
nombre varchar(30) not null,
apellido varchar(30) not null,
correo varchar(30)  not null,
celular varchar(30) not null

)
go
select * from cliente
go