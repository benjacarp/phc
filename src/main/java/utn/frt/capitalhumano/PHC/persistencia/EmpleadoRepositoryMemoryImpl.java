package utn.frt.capitalhumano.PHC.persistencia;

import org.springframework.stereotype.Repository;
import utn.frt.capitalhumano.PHC.dominio.Empleado;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpleadoRepositoryMemoryImpl implements EmpleadoRepositoryMemory {
    private int id = 0;

    private List<Empleado> empleados = new ArrayList<Empleado>();

    public List<Empleado> getAll() {
        return empleados;
    }

    public void save(Empleado empleado) {
        empleado.setIdEmpleado(++id);
        empleados.add(empleado);
    }

    public void delete(int id) throws Exception {
        Empleado toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el empleado");
        }
        empleados.remove(toBeDeleted);
    }

    public Empleado findById(int id) {
        for (Empleado d : empleados) {
            if (d.getIdEmpleado() == id) {
                return d;
            }
        }
        return null;
    }

    public void update(Empleado empleado, int id) throws Exception {
        Empleado toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el empleado");
        }
        toBeDeleted.setNombre(empleado.getNombre());
        //TODO: agregar los demás atributos
    }
}
