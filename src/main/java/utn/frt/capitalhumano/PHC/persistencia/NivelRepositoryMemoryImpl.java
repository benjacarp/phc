package utn.frt.capitalhumano.PHC.persistencia;

import org.springframework.stereotype.Repository;
import utn.frt.capitalhumano.PHC.dominio.Departamento;
import utn.frt.capitalhumano.PHC.dominio.Nivel;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NivelRepositoryMemoryImpl implements NivelRepositoryMemory {
    private int id = 0;

    private List<Nivel> niveles = new ArrayList<Nivel>();

    public List<Nivel> getAll() {
        return niveles;
    }

    public void save(Nivel nivel) {
        nivel.setIdNivel(++id);
        niveles.add(nivel);
    }

    public void delete(int id) throws Exception {
        Nivel toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el nivel");
        }
        niveles.remove(toBeDeleted);
    }

    public Nivel findById(int id) {
        for (Nivel d : niveles) {
            if (d.getIdNivel() == id) {
                return d;
            }
        }
        return null;
    }

    public void update(Nivel nivel, int id) throws Exception {
        Nivel toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el nivel");
        }
        toBeDeleted.setNombre(nivel.getNombre());
    }
}
