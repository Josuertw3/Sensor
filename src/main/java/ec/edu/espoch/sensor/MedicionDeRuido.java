/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sensor;

/**
 *
 * @author AKRU
 */
public class MedicionDeRuido {
    private double decibeles;
    private String hora;

    public MedicionDeRuido() {
    }

    public MedicionDeRuido(double decibeles, String hora) {
        this.decibeles = decibeles;
        this.hora = hora;
    }

    public double getDecibeles() {
        return decibeles;
    }

    public void setDecibeles(double decibeles) {
        this.decibeles = decibeles;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void mostrarDatos() {
        System.out.println("Hora: " + hora + " | Decibeles: " + decibeles + " dB");
    }
}
