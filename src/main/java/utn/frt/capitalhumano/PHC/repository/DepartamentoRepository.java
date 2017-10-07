package utn.frt.capitalhumano.PHC.repository;

import org.springframework.stereotype.Repository;
import utn.frt.capitalhumano.PHC.dominio.Departamento;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartamentoRepository {
    private int id = 0;

    private List<Departamento> departamentos = new ArrayList<Departamento>();

    public List<Departamento> getAll() {
        return departamentos;
    }

    public void save(Departamento departamento) {
        departamento.setIdDepartamento(++id);
        departamentos.add(departamento);
    }

    public void delete(int id) throws Exception {
        Departamento toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el departamento");
        }
        departamentos.remove(toBeDeleted);
    }

    public Departamento findById(int id) {
        for (Departamento d : departamentos) {
            if (d.getIdDepartamento() == id) {
                return d;
            }
        }
        return null;
    }
}
