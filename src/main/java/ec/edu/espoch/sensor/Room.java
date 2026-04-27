/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sensor;

/**
 *
 * @author AKRU
 */
public class Room {
     private String nombre;
    private int capacidad;

    public Room() {
    }

    

    public Room (String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void mostrarSalon() {
        System.out.println("Salon: " + nombre);
        System.out.println("Capacidad: " + capacidad + " estudiantes");
    }
}
