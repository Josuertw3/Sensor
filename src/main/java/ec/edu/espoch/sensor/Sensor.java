/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.sensor;

/**
 *
 * @author AKRU
 */
public class Sensor {

    public static void main(String[] args) {
        // Crear objeto salón
        Room salon1 = new Room("Aula A1", 30);

        // Crear objetos de medición
        MedicionDeRuido medicion1 = new MedicionDeRuido(55.4, "08:00");
        MedicionDeRuido medicion2 = new MedicionDeRuido(62.7, "09:00");

        // Mostrar datos
        salon1.mostrarSalon();

        System.out.println("Mediciones registradas:");
        medicion1.mostrarDatos();
        medicion2.mostrarDatos();

      
    }

}
