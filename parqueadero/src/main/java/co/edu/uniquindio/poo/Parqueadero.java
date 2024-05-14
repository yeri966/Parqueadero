package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Predicate;

public class Parqueadero {
    private final String nombre;
    private int numeroPuestos;
    private final Collection <Registro> registros;
    private final Collection <Puesto> puestos;
    private final Collection <Vehiculo> vehiculos;

    public Parqueadero(String nombre, int numeroPuestos) {
        ASSERTION.assertion(nombre != null && !nombre.isBlank(),"Error: el nombre no puede ser nulo ni estar vacío");
        ASSERTION.assertion(numeroPuestos > 0, "Error: el numero de puestos debe ser mayor de cero puestos");
        this.nombre = nombre;
        this.numeroPuestos = numeroPuestos;
        registros = new LinkedList<>();
        puestos = new LinkedList <>();
        vehiculos = new LinkedList<>();
        crearPuestos(numeroPuestos);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuestos(){
        return numeroPuestos;
    }

    public void addVehiculo (Vehiculo vehiculo){
        ASSERTION.assertion(!verificarVehiculo(vehiculo.getPlaca()),"Error: el vehiculo ya se encuentra registrado");

        vehiculos.add(vehiculo);
    }

    private boolean verificarVehiculo(String placa){
        Predicate<Vehiculo> placaIgual = vehiculo -> vehiculo.getPlaca().equals(placa);
        return vehiculos
                .stream()
                .filter(placaIgual)
                .findAny()
                .isPresent();
    }

    public void crearPuestos(int numeroPuestos){
        for (int i = 0; i < numeroPuestos; i++){
            String posicionI =  "Fila " + (i + 1);
            for(int j = 0; j < numeroPuestos; j++){
                String posicionJ = "Columna " + (j+ 1);
                Puesto puesto = new Puesto(posicionI, posicionJ, Estado.LIBRE);
                puestos.add(puesto);
            }
        }
        
    }

    public void addVehiculoPuestoDado (Vehiculo vehiculo, String posicionI, String posicionJ){
        ASSERTION.assertion(!verificarPuestoDisponible(posicionI, posicionJ, Estado.LIBRE), "Error: el puesto se encuentra ocupado");

        Optional <Puesto> puestoAbuscar = buscarPuesto(posicionI, posicionJ);
        puestoAbuscar.ifPresent(puesto -> puesto.setVehiculo(vehiculo));
        actualizarEstadoPuesto(posicionI, posicionJ, Estado.OCUPADO);
        addVehiculo(vehiculo);
    }

    public boolean verificarPuestoDisponible (String posicionI, String posicionJ, Estado estado){
        Predicate<Puesto> posiblePuesto = puesto -> puesto.getPosicionI().equals(posicionI) && puesto.getPosicionJ().equals(posicionJ) && puesto.getEstado().equals(estado);
        return puestos
                .stream()
                .filter(posiblePuesto)
                .findAny()
                .isPresent();
    }

    private Optional <Puesto> buscarPuesto (String posicionI, String posicionJ){
        Predicate <Puesto> posiblePuesto = puesto -> puesto.getPosicionI().equals(posicionI) && puesto.getPosicionJ().equals(posicionJ);
        return puestos.stream().filter(posiblePuesto).findFirst();
    }

    private void actualizarEstadoPuesto(String posicionI, String posicionJ, Estado estadoNuevo){
        Optional<Puesto> puestoEncontrado = buscarPuesto(posicionI, posicionJ);

        puestoEncontrado.ifPresent(puesto -> puesto.setEstado(estadoNuevo));
    }

    public Optional identificarPropietario(Vehiculo vehiculo, String posicionI, String posicionJ){
        Predicate<Puesto> puestoPropietario = puesto -> puesto.getPosicionI().equals(posicionI) && puesto.getPosicionJ().equals(posicionJ)
        return vehiculos
                .stream()
                .filter(propietarioIgual)
                .findAny()
                .isPresent();
    }

    public Collection<Registro> getRegistros() {
        return registros;
    }

    public Collection<Puesto> getPuestos() {
        return puestos;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
