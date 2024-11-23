package contactos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import contacto.Contacto;
import contacto.GestorContactos;

public class GestorContactosTest {
	
	@Test
    public void testGuardarContacto() {
        GestorContactos gestor = new GestorContactos();
        Contacto contacto = new Contacto(1, "Juan", "juan@example.com", 30);

        gestor.guardarContacto(contacto);
        assertEquals(1, gestor.buscarContactos().size());
    }

    @Test
    public void testBuscarContactoPorId() {
        GestorContactos gestor = new GestorContactos();
        Contacto contacto = new Contacto(1, "Juan", "juan@example.com", 30);
        gestor.guardarContacto(contacto);

        Contacto encontrado = gestor.buscarContactoPorId(1);
        assertNotNull(encontrado);
        assertEquals("Juan", encontrado.getNombre());
    }

    @Test
    public void testEliminarContacto() {
        GestorContactos gestor = new GestorContactos();
        Contacto contacto = new Contacto(1, "Juan", "juan@example.com", 30);
        gestor.guardarContacto(contacto);

        boolean eliminado = gestor.eliminarContacto(1);
        assertTrue(eliminado);
        assertEquals(0, gestor.buscarContactos().size());
    }

}
