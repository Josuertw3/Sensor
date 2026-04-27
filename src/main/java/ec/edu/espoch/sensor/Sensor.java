/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.sensor;

import ec.edu.espoch.sensor.Interfaces.RuidoDAO;

/**
 *
 * @author AKRU
 */
public class Sensor {

    public static void main(String[] args) {
        
        Room salon1 = new Room("Aula A1", 30);

       
        MedicionDeRuido medicion1 = new MedicionDeRuido(55.4, "08:00");
        MedicionDeRuido medicion2 = new MedicionDeRuido(62.7, "09:00");

       
        salon1.mostrarSalon();
       
        RuidoDAO dao = new RuidoDAOImpl();

       
        dao.guardarMedicion(medicion1);
        dao.guardarMedicion(medicion2);

      
    }

}
