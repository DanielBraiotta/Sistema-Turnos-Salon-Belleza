package ar.edu.unahur.obj2.peluqueria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.peluqueria.categoria.Frecuente;
import ar.edu.unahur.obj2.peluqueria.servicio.Coloracion;
import ar.edu.unahur.obj2.peluqueria.servicio.Servicio;

public class CorteDeCabelloTest {

@Test
    @DisplayName("Instanciar correctamente un cliente")
    void test1() {
        Cliente cliente = new Cliente("Daniel", new Frecuente());

        assertEquals("Daniel", cliente.getNombre());
    }

 
@Test
    @DisplayName("Instanciar correctamente un servicio")
    void test2() {
        Servicio servicio = new Coloracion(2000.0, 5);

        assertEquals(2000.0, servicio.getPrecioBase());
    }

@Test
    @DisplayName("Instanciar un turno")
    void test3() {
        Servicio servicio = new Coloracion(2000.0, 5);
        
        Cliente cliente = new Cliente("Daniel", new Frecuente());

        Turno turno = new Turno(cliente, servicio, 2);
        
        assertEquals(2, turno.getCantidadSeciones()); 
        assertEquals(cliente, turno.getCliente()); 
        assertEquals(servicio, turno.getServicio()); 
        assertNull(turno.getImporteTotal());
    }

}