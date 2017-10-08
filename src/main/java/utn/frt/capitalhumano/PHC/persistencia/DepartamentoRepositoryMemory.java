package utn.frt.capitalhumano.PHC.persistencia;

import utn.frt.capitalhumano.PHC.dominio.Departamento;

import java.util.List;

public interface DepartamentoRepositoryMemory {
    List<Departamento> getAll();

    void save(Departamento departamento);

    void delete(int id) throws Exception;

    Departamento findById(int id);

    void update(Departamento departamento, int id) throws Exception;
}
