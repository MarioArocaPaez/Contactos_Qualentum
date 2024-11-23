package contacto;

import java.util.ArrayList;
import java.util.List;

public class GestorContactos {
	private List<Contacto> contactos = new ArrayList<>();

    public void guardarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public Contacto buscarContactoPorId(int id) {
        return contactos.stream()
                .filter(contacto -> contacto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Contacto> buscarContactos() {
        return new ArrayList<>(contactos);
    }

    public boolean eliminarContacto(int id) {
        return contactos.removeIf(contacto -> contacto.getId() == id);
    }

}
