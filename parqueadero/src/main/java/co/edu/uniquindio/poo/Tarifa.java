package co.edu.uniquindio.poo;

public enum Tarifa {
    MOTO_HIBRIDA (3000.0),
    MOTO_CLASICA (2300.0),
    CARRO (4000.0);

    private double tarifa;

    private Tarifa ( double tarifa){
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
}
