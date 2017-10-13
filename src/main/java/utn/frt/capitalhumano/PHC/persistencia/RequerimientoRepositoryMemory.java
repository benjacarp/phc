package utn.frt.capitalhumano.PHC.persistencia;

import utn.frt.capitalhumano.PHC.dominio.Requerimiento;

import java.util.List;

public interface RequerimientoRepositoryMemory {
    List<Requerimiento> getAll();

    void save(Requerimiento requerimiento);

    void delete(int id) throws Exception;

    Requerimiento findById(int id);

    void update(Requerimiento requerimiento, int id) throws Exception;
}
