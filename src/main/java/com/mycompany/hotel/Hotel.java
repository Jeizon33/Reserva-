/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hotel;
import com.mycompany.hotel.cliente.*;
import com.mycompany.hotel.habitacion.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jhonk
 */
public class Hotel {
    private static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ejecucion =true;
        int cedula;
        /*mostrarMenu();
        int opcion =  scanner.nextInt();
        scanner.nextLine();*/
        //ArrayList<ClienteVip> clVip = new ArrayList<>();
        ArrayList<Cliente> cl = new ArrayList<>();
        ArrayList<Reserva> reserva = new ArrayList<>();
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        
        
        while (ejecucion){
            mostrarMenu();
            int opcion =  scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1: //Resgistrar cliente
                    System.out.print("Ingrese su número de cédula: ");
                    //String cedulaString = scanner.nextLine();
                    cedula = Integer.parseInt(scanner.nextLine());

                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese su apellido: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Ingrese su email: ");
                    String email = scanner.nextLine();

                    System.out.print("Ingrese su teléfono: ");
                    String txtTelefono = scanner.nextLine();
                    
                    System.out.print("Ingrese tipo de cliente (Regular/VIP): ");
                    String tipoCliente = scanner.nextLine();
                    
                    if (tipoCliente.equals("VIP")) {
                        cl.add(new ClienteVip(tipoCliente, cedula, nombre, apellido, email, txtTelefono, tipoCliente));
                        //menu();
                        
                    } else if (tipoCliente.equals("Regular")){
                        cl.add(new Cliente(cedula, nombre, apellido, email, txtTelefono, tipoCliente));
                    } else {
                        System.out.println("Esa no es una opcion");
                    }
                    break;
                case 2: //Realizar reserva
                    Random random =new Random();
                    int numeroReserva = random.nextInt(100);
                    System.out.print("Ingrese el numero de cedula: ");
                    cedula = Integer.parseInt(scanner.nextLine());
                    
                    System.out.print("Ingrese el numero de la habitacion: ");
                    int numeroHabitacion = Integer.parseInt(scanner.nextLine());
                    
                    System.out.print("Ingrese la fecha de entrada: ");
                    String fechaEntrada = scanner.nextLine();
                    
                    System.out.print("Ingrese la fecha de salida: ");
                    String fechaSalida = scanner.nextLine();
                    
                    String estadoReserva = "Activa";
                    reserva.add(new Reserva(numeroReserva, cedula, numeroHabitacion, fechaEntrada, fechaSalida, estadoReserva));
                    System.out.println("Reserva generada con el numero: " +numeroReserva);
                    break;
                case 3://cancelarReserva
                    System.out.println("Ingrese el codigo de la reserva que desea cancelar: ");
                    int codReserva = Integer.parseInt(scanner.nextLine());
                    for (Reserva reservas : reserva) {
                        if(reservas.getNumeroReserva()==codReserva){
                            reservas.setEstadoReserva("Cancelada");
                            System.out.println("Reserva numero " + reservas.getNumeroReserva() +" Fue cancelada");
                            
                        }
                    }
                    break;
                case 4://Listar Reservas
                    for (Reserva reservas : reserva) {
                        System.out.println("\nEstado de reserva: " +reservas.getEstadoReserva());
                        System.out.println("Cedula de cliente: " +reservas.getIdCliente());
                        System.out.println("Numero de reserva: " +reservas.getNumeroReserva());
                        System.out.println("Numero de habitacion: " +reservas.getNumeroHabitacion());
                        System.out.println("Fecha de entrada: " +reservas.getFechaEntrada());
                        System.out.println("Fecha de salida: " +reservas.getFechaSalida());
                        System.out.println("********************************");
                    }
                    break;
                case 5://Listar reserva por cliente
                    System.out.println("Ingrese el numero de cedula del cliente: ");
                    int codCedula = Integer.parseInt(scanner.nextLine());
                    for (Reserva cliente : reserva) {
                        if(cliente.getIdCliente()==codCedula){
                            System.out.println("\nEstado de reserva: " +cliente.getEstadoReserva());
                            System.out.println("Cedula de cliente: " +cliente.getIdCliente());
                            System.out.println("Numero de reserva: " +cliente.getNumeroReserva());
                            System.out.println("Numero de habitacion: " +cliente.getNumeroHabitacion());
                            System.out.println("Fecha de entrada: " +cliente.getFechaEntrada());
                            System.out.println("Fecha de salida: " +cliente.getFechaSalida());
                            System.out.println("********************************");
                        }
                    }
                    break;
                case 6:
                    //listarHabitacionesDisponibles();
                    break;
                case 7:
                    //registrarServiciosAdicionales();
                    break;
                case 0:
                    ejecucion = false;
                    System.out.println(reserva.get(0).getEstadoReserva());
                    break;
                default:
                    System.out.println("Esa no es una opcion");
            }
        }
        
        
        
    }
    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Gestión de Hotel ---");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Realizar Reserva");
        System.out.println("3. Cancelar Reserva");
        System.out.println("4. Listar Reservas");
        System.out.println("5. Buscar Reserva por Cliente");
        System.out.println("6. Listar Habitaciones Disponibles");
        System.out.println("7. Registrar Servicios Adicionales");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
        }
    
    
}
