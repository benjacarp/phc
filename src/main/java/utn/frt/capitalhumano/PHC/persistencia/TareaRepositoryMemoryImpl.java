package utn.frt.capitalhumano.PHC.persistencia;

import org.springframework.stereotype.Repository;
import utn.frt.capitalhumano.PHC.dominio.Tarea;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TareaRepositoryMemoryImpl implements TareaRepositoryMemory {
    private int id = 0;

    private List<Tarea> tareas = new ArrayList<Tarea>();

    public List<Tarea> getAll() {
        return tareas;
    }

    public void save(Tarea tarea) {
        tarea.setIdTarea(++id);
        tareas.add(tarea);
    }

    public void delete(int id) throws Exception {
        Tarea toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el tarea");
        }
        tareas.remove(toBeDeleted);
    }

    public Tarea findById(int id) {
        for (Tarea d : tareas) {
            if (d.getIdTarea() == id) {
                return d;
            }
        }
        return null;
    }

    public void update(Tarea tarea, int id) throws Exception {
        Tarea toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el tarea");
        }
        toBeDeleted.setDescripcion(tarea.getDescripcion());
        //todo: agregar los demás atributos
    }
}
