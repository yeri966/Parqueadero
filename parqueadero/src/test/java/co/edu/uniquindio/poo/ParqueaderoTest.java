package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Clase para probar la clase Parqueadero
 * 
 * @author Jaider Andrés Melo Rodríguez
 * @author Yerilin Ul Yalanda
 * @since 2024-05
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class ParqueaderoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());

    @Test
    public void datosCompletosParqueadero(){
        LOG.info("Iniciando test de datos completos del parqueadero");

        var parqueadero = new Parqueadero("Parkeando", 20);

        assertEquals("Parkeando", parqueadero.getNombre());
        assertEquals(20, parqueadero.getNumeroPuestos());
        
        LOG.info("Finalizando test de datos completos del parqueadero");
    }

    @Test 
    public void añadirVehiculosDiferentes(){
        LOG.info("Iniciando test de añadir vehiculos diferentes al parqueadero");

        var parqueadero = new Parqueadero("Parkeando", 20);

        var propietario1 = new Propietario("Yerilin", "Ul", 27, "0987654321", "yerilin@gmail.com");
        var propietario2 = new Propietario("Andrés", "Rodriguez", 20, "1234567890", "andres@gmail.com");
        var propietario3 = new Propietario("Camila", "Zamudio", 19, "87438784", "camila@gmail.com");

        var carro = new Carro("AYS27G", "Duster", propietario1);
        var motoClasica = new Moto("NEL47C", "MT 09 2024", propietario2, 200, TipoMoto.CLASICA);
        var motoHibrida = new Moto("MSD38G", "BWS FI", propietario3, 150, TipoMoto.HIBRIDA);

        parqueadero.addVehiculoPuestoDado(carro, "1", "1");
        parqueadero.addVehiculoPuestoDado(motoClasica, "2", "2");
        parqueadero.addVehiculoPuestoDado(motoHibrida, "3", "3");
        
        LOG.info("Finalizando test de añadir vehiculos diferentes al parqueadero");
    }

    @Test 
    public void añadirVehiculosIguales(){
        LOG.info("Iniciando test de añadir vehiculos diferentes al parqueadero");

        var parqueadero = new Parqueadero("Parkeando", 20);

        var propietario1 = new Propietario("Yerilin", "Ul", 27, "0987654321", "yerilin@gmail.com");
        var propietario2 = new Propietario("Andrés", "Rodriguez", 20, "1234567890", "andres@gmail.com");
        var propietario3 = new Propietario("Camila", "Zamudio", 19, "87438784", "camila@gmail.com");

        var carro = new Carro("AYS27G", "Duster", propietario1);
        var motoClasica = new Moto("NEL47C", "MT 09 2024", propietario2, 200, TipoMoto.CLASICA);
        var motoClasica2 = new Moto("NEL47C", "MT 09 2024", propietario3, 200, TipoMoto.CLASICA);

        parqueadero.addVehiculoPuestoDado(carro, "1", "1");
        parqueadero.addVehiculoPuestoDado(motoClasica, "2", "2");
        

        assertEquals(false, parqueadero.verificarPuestoDisponible("1", "1", Estado.OCUPADO));
        assertEquals(false, parqueadero.verificarPuestoDisponible("2", "2", Estado.OCUPADO));
        assertEquals(true, parqueadero.verificarPuestoDisponible("3", "3", Estado.LIBRE));
        //assertThrows(Throwable.class, ()-> parqueadero.addVehiculoPuestoDado(motoClasica2, "2", "2"));
        
        LOG.info("Finalizando test de añadir vehiculos diferentes al parqueadero");

    }

    @Test
    public void crearPuestos(){
        
        var parqueadero = new Parqueadero("Parkeando", 5);

        assertEquals(25, parqueadero.getPuestos().size());
    }
}
