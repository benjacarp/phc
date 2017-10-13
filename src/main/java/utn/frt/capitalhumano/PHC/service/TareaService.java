package utn.frt.capitalhumano.PHC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.frt.capitalhumano.PHC.dominio.Tarea;
import utn.frt.capitalhumano.PHC.persistencia.TareaRepositoryMemory;

import java.util.List;

@Component
public class TareaService {
    @Autowired
    private TareaRepositoryMemory repository;

    public List<Tarea> getAllTareas() {
        return repository.getAll();
    }

    public String save(Tarea tarea) {
        repository.save(tarea);
        return "tarea creado";
    }

    public String delete(int id) {
        try {
            repository.delete(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Borrado exitoso";
    }

    public Tarea getTareaById(int id) {
        return repository.findById(id);
    }

    public String update(Tarea tarea, int id) {
        try {
            repository.update(tarea, id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "modificacion exitosa";
    }
}
