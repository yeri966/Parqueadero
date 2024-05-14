package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;


public class Puesto {
    public static Object parqueadero;
    private final String posicionI;
    private final String posicionJ;
    private Estado estado;
    private Vehiculo vehiculo;

    public Puesto(String posicionI, String posicionJ, Estado estado) {
        ASSERTION.assertion(posicionI != null && !posicionI.isBlank(),
                "Error: la posicion I no puede ser nula ni estar vacía");
        ASSERTION.assertion(posicionJ != null && !posicionJ.isBlank(),
                "Error: la posicion I no puede ser nula ni estar vacía");
        ASSERTION.assertion(estado != null, "Error: el estado no puede ser nulo");
        this.posicionI = posicionI;
        this.posicionJ = posicionJ;
        this.estado = estado;
    }

    public String getPosicionI() {
        return posicionI;
    }

    public String getPosicionJ() {
        return posicionJ;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estadoNuevo){
        this.estado = estadoNuevo;
    }

    public Vehiculo getVehiculo(){
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

}
