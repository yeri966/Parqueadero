package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Clase para probar la clase Tarifa
 * 
 * @author Jaider Andrés Melo Rodríguez
 * @author Yerilin Ul Yalanda
 * @since 2024-05
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class TarifaTest {
    private static final Logger LOG = Logger.getLogger(TarifaTest.class.getName());

    @Test
    public void obtenerValorTarifa(){
        LOG.info("Iniciando test de obtener el valor de la tarifa");

        var tarifaCarro = Tarifa.CARRO;
        var tarifaMotoClasica = Tarifa.MOTO_CLASICA;
        var tarifaMotoHibrida = Tarifa.MOTO_HIBRIDA;

        assertEquals(4000.0, tarifaCarro.getTarifa());
        assertEquals(2300.0, tarifaMotoClasica.getTarifa());
        assertEquals(3000.0, tarifaMotoHibrida.getTarifa());

        LOG.info("Finalizando test de obtener el valor de la tarifa");
    }

    @Test
    public void cambiarValorTarifa(){
        LOG.info("Iniciando test de cambiar el valor de la tarifa");

        var tarifaCarro = Tarifa.CARRO;
        var tarifaMotoClasica = Tarifa.MOTO_CLASICA;
        var tarifaMotoHibrida = Tarifa.MOTO_HIBRIDA;

        tarifaCarro.setTarifa(5000.0);
        tarifaMotoClasica.setTarifa(3300.0);
        tarifaMotoHibrida.setTarifa(4000.0);

        assertEquals(5000.0, tarifaCarro.getTarifa());
        assertEquals(3300.0, tarifaMotoClasica.getTarifa());
        assertEquals(4000.0, tarifaMotoHibrida.getTarifa());
        
        LOG.info("Finalizando test de cambiar el valor de la tarifa");
    }
}
