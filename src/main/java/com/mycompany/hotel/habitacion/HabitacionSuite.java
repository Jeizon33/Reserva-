/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.habitacion;

/**
 *
 * @author Jhonk
 */
public class HabitacionSuite extends Habitacion{
    String tipo ="Suite";
    

    public HabitacionSuite(int numeroHabitacion, int numeroCamas, double precio, String tipoHabitacion, String estado) {
        super(numeroHabitacion, numeroCamas, precio, tipoHabitacion, estado);
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
