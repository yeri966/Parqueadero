package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class Moto extends Vehiculo{
    private final double velocidadMaxima;
    private final TipoMoto tipoMoto;

    public Moto(String placa, String modelo, Propietario propietario, double velocidadMaxima, TipoMoto tipoMoto) {
        super(placa, modelo, propietario);

        ASSERTION.assertion(velocidadMaxima >0, "Error: la velocidad maxima no puede ser negativa");
        ASSERTION.assertion(tipoMoto != null, "Error: el tipo de moto no puede ser nulo");

        this.velocidadMaxima = velocidadMaxima;
        this.tipoMoto = tipoMoto;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }
    
}
