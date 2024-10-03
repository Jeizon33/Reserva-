/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.cliente;

/**
 *
 * @author Jhonk
 */
public class Cliente {
    int Id;
    String nombre;
    String apellido;
    String email;
    String telefono;
    String tipoCliente;
    
    public Cliente() {
    }

    public Cliente(int Id, String nombre, String apellido, String email, String telefono, String tipoCliente) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.tipoCliente = tipoCliente;
    }
    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public void registrarUsuario(int Id, String nombre, String apellido, String email, int telefono, String tipoCliente){
        Cliente cl= new Cliente();
        cl.setNombre(this.nombre);
        cl.setId(this.Id);
        cl.setApellido(this.apellido);
        cl.setEmail(this.email);
        cl.setTipoCliente(this.tipoCliente);
    }
    
}
