package ec.edu.espoch.sensor;

import ec.edu.espoch.sensor.Interfaces.RuidoDAO;

public class RuidoDAOImpl implements RuidoDAO {

    @Override
    public void guardarMedicion(MedicionDeRuido medicion) {
        System.out.println("Guardando medicion...");
        medicion.mostrarDatos();
    }
}