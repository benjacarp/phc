package utn.frt.capitalhumano.PHC.persistencia;

import utn.frt.capitalhumano.PHC.dominio.Tarea;

import java.util.List;

public interface TareaRepositoryMemory {
    List<Tarea> getAll();

    void save(Tarea tarea);

    void delete(int id) throws Exception;

    Tarea findById(int id);

    void update(Tarea tarea, int id) throws Exception;
}
