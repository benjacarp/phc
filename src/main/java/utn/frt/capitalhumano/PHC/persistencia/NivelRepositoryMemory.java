package utn.frt.capitalhumano.PHC.persistencia;

import utn.frt.capitalhumano.PHC.dominio.Nivel;

import java.util.List;

public interface NivelRepositoryMemory {
    List<Nivel> getAll();

    void save(Nivel nivel);

    void delete(int id) throws Exception;

    Nivel findById(int id);

    void update(Nivel nivel, int id) throws Exception;
}
