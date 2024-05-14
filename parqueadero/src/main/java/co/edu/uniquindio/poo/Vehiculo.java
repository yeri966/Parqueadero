package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;
/**
 * Clase para manejar la información de un Vehiculo
 * 
 * @author Jaider Andrés Melo Rodríguez
 * @author Yerilin Ul Yalanda
 * @since 2024-05
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class Vehiculo {
    private final String placa;
    private final String modelo;
    private final Propietario propietario;
    private Tarifa tarifaVehiculo;

    public Vehiculo(String placa, String modelo, Propietario propietario) {
        ASSERTION.assertion(placa != null && !placa.isBlank(), "La placa no puede ser nula ni vacía");
        ASSERTION.assertion(modelo != null && !modelo.isBlank(), "El modelo no puede ser nulo ni vacío");
        ASSERTION.assertion(propietario != null, "El propietario no puede ser nulo ni vacío");
        
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public Tarifa getTarifaVehiculo() {
        return tarifaVehiculo;
    }

    
    
}
