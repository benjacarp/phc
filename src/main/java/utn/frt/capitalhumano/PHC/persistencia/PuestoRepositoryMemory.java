package utn.frt.capitalhumano.PHC.persistencia;

import utn.frt.capitalhumano.PHC.dominio.Puesto;

import java.util.List;

public interface PuestoRepositoryMemory {
    List<Puesto> getAll();

    void save(Puesto puesto);

    void delete(int id) throws Exception;

    Puesto findById(int id);

    void update(Puesto puesto, int id) throws Exception;
}
