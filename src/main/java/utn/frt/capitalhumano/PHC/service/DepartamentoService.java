package utn.frt.capitalhumano.PHC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.frt.capitalhumano.PHC.dominio.Departamento;
import utn.frt.capitalhumano.PHC.repository.DepartamentoRepository;

import java.util.List;

@Component
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository repository;

    public List<Departamento> getAllDepartamentos() {
        return repository.getAll();
    }

    public String save(Departamento departamento) {
        repository.save(departamento);
        return "departamento creado";
    }

    public String delete(int id) {
        try {
            repository.delete(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Borrado exitoso";
    }

    public Departamento getDepartamentoById(int id) {
        return repository.findById(id);
    }

    public String update(Departamento departamento, int id) {
        try {
            repository.update(departamento, id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "modificacion exitosa";
    }
}
