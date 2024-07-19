/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author Jhonk
 */
public class Reserva {
    int numeroReserva,idCliente,numeroHabitacion;
    String fechaEntrada,fechaSalida,estadoReserva;

    public Reserva() {
    }

    public Reserva(int numeroReserva, int idCliente, int numeroHabitacion, String fechaEntrada, String fechaSalida, String estadoReserva) {
        this.numeroReserva = numeroReserva;
        this.idCliente = idCliente;
        this.numeroHabitacion = numeroHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estadoReserva = estadoReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }
    

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }
    
    
    
}
