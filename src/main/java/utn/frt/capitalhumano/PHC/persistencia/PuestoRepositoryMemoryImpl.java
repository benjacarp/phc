package utn.frt.capitalhumano.PHC.persistencia;

import org.springframework.stereotype.Repository;
import utn.frt.capitalhumano.PHC.dominio.Puesto;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PuestoRepositoryMemoryImpl implements PuestoRepositoryMemory {
    private int id = 0;

    private List<Puesto> puestos = new ArrayList<Puesto>();

    public List<Puesto> getAll() {
        return puestos;
    }

    public void save(Puesto puesto) {
        puesto.setIdPuesto(++id);
        puestos.add(puesto);
    }

    public void delete(int id) throws Exception {
        Puesto toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el puesto");
        }
        puestos.remove(toBeDeleted);
    }

    public Puesto findById(int id) {
        for (Puesto d : puestos) {
            if (d.getIdPuesto() == id) {
                return d;
            }
        }
        return null;
    }

    public void update(Puesto puesto, int id) throws Exception {
        Puesto toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el puesto");
        }
        toBeDeleted.setNombre(puesto.getNombre());
        //TODO: agreagar los demás atributos
    }
}
