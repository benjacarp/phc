package utn.frt.capitalhumano.PHC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.frt.capitalhumano.PHC.dominio.Empleado;
import utn.frt.capitalhumano.PHC.persistencia.EmpleadoRepositoryMemory;

import java.util.List;

@Component
public class EmpleadoService {
    @Autowired
    private EmpleadoRepositoryMemory repository;

    public List<Empleado> getAllEmpleados() {
        return repository.getAll();
    }

    public String save(Empleado empleado) {
        repository.save(empleado);
        return "empleado creado";
    }

    public String delete(int id) {
        try {
            repository.delete(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Borrado exitoso";
    }

    public Empleado getEmpleadoById(int id) {
        return repository.findById(id);
    }

    public String update(Empleado empleado, int id) {
        try {
            repository.update(empleado, id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "modificacion exitosa";
    }
}
