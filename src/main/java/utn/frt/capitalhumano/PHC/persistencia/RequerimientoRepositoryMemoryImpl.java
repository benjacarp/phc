package utn.frt.capitalhumano.PHC.persistencia;

import org.springframework.stereotype.Repository;
import utn.frt.capitalhumano.PHC.dominio.Requerimiento;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RequerimientoRepositoryMemoryImpl implements RequerimientoRepositoryMemory {
    private int id = 0;

    private List<Requerimiento> requerimientos = new ArrayList<Requerimiento>();

    public List<Requerimiento> getAll() {
        return requerimientos;
    }

    public void save(Requerimiento requerimiento) {
        requerimiento.setIdRequerimiento(++id);
        requerimientos.add(requerimiento);
    }

    public void delete(int id) throws Exception {
        Requerimiento toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el requerimiento");
        }
        requerimientos.remove(toBeDeleted);
    }

    public Requerimiento findById(int id) {
        for (Requerimiento d : requerimientos) {
            if (d.getIdRequerimiento() == id) {
                return d;
            }
        }
        return null;
    }

    public void update(Requerimiento requerimiento, int id) throws Exception {
        Requerimiento toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el requerimiento");
        }
        toBeDeleted.setDescripcion(requerimiento.getDescripcion());
        //TODO: agregar los demaś atributos
    }
}
