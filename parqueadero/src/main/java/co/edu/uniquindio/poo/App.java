package co.edu.uniquindio.poo;

import java.util.Collection;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero("Mi Parqueadero", 5);

        // Obtener la colección de puestos del parqueadero
        Collection<Puesto> puestos = parqueadero.getPuestos();

        var propietario1 = new Propietario("Yerilin", "Ul", 27, "0987654321", "yerilin@gmail.com");
        var propietario2 = new Propietario("Andrés", "Rodriguez", 20, "1234567890", "andres@gmail.com");

        var carro = new Carro("AYS27G", "Duster", propietario1);
        var motoClasica = new Moto("NEL47C", "MT 09 2024", propietario2, 200, TipoMoto.CLASICA);

        parqueadero.addVehiculoPuestoDado(carro, "1", "1");
        parqueadero.addVehiculoPuestoDado(motoClasica, "2", "2");

        // Imprimir la matriz de puestos
        System.out.println("Matriz de Puestos:");
        for (Puesto puesto : puestos) {
            System.out.println("[" + puesto.getPosicionI() + ", " + puesto.getPosicionJ() + ", " + puesto.getEstado() + "]");
        }
    }
}
