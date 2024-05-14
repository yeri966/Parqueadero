package co.edu.uniquindio.poo;

public class Administrador extends Persona{

    public Administrador(String nombres, String apellidos, int edad, String celular, String correo) {
        super(nombres, apellidos, edad, celular, correo);
    }

    public void cambiarTarifa (Tarifa tipoVehiculo, double nuevoValorTarifa){
        tipoVehiculo.setTarifa(nuevoValorTarifa);
    }
    
}
