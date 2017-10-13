package utn.frt.capitalhumano.PHC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.frt.capitalhumano.PHC.dominio.Usuario;
import utn.frt.capitalhumano.PHC.persistencia.UsuarioRepositoryMemory;

import java.util.List;

@Component
public class UsuarioService {
    @Autowired
    private UsuarioRepositoryMemory repository;

    public List<Usuario> getAllUsuarios() {
        return repository.getAll();
    }

    public String save(Usuario usuario) {
        repository.save(usuario);
        return "usuario creado";
    }

    public String delete(int id) {
        try {
            repository.delete(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Borrado exitoso";
    }

    public Usuario getUsuarioById(int id) {
        return repository.findById(id);
    }

    public String update(Usuario usuario, int id) {
        try {
            repository.update(usuario, id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "modificacion exitosa";
    }
}
