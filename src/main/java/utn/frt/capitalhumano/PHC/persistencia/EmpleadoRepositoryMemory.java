package utn.frt.capitalhumano.PHC.persistencia;

import utn.frt.capitalhumano.PHC.dominio.Empleado;

import java.util.List;

public interface EmpleadoRepositoryMemory {
    List<Empleado> getAll();

    void save(Empleado empleado);

    void delete(int id) throws Exception;

    Empleado findById(int id);

    void update(Empleado empleado, int id) throws Exception;
}
