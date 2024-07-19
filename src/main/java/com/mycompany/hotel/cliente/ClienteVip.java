/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.cliente;

/**
 *
 * @author Jhonk
 */
public class ClienteVip extends Cliente{
    double descuento=0.0;
    String beneficiosAdicionales;
    public ClienteVip() {
    }

    public ClienteVip(String beneficiosAdicionales) {
        this.beneficiosAdicionales = beneficiosAdicionales;
    }
    

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getBeneficiosAdicionales() {
        return beneficiosAdicionales;
    }

    public void setBeneficiosAdicionales(String beneficiosAdicionales) {
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    public ClienteVip(String beneficiosAdicionales, int Id, String nombre, String apellido, String email, String telefono, String tipoCliente) {
        super(Id, nombre, apellido, email, telefono, tipoCliente);
        this.beneficiosAdicionales = beneficiosAdicionales;
    }
    
    
}
