/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.habitacion;

/**
 *
 * @author Jhonk
 */
public class Habitacion {
    int numeroHabitacion;
    int numeroCamas;
    double precio;
    String tipoHabitacion;
    String estado;

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion, int numeroCamas, double precio, String tipoHabitacion, String estado) {
        this.numeroHabitacion = numeroHabitacion;
        this.numeroCamas = numeroCamas;
        this.precio = precio;
        this.tipoHabitacion=tipoHabitacion;
        this.estado = estado;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
