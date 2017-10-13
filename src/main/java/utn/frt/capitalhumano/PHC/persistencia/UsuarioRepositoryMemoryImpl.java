package utn.frt.capitalhumano.PHC.persistencia;

import org.springframework.stereotype.Repository;
import utn.frt.capitalhumano.PHC.dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepositoryMemoryImpl implements UsuarioRepositoryMemory {
    private int id = 0;

    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public List<Usuario> getAll() {
        return usuarios;
    }

    public void save(Usuario usuario) {
        usuario.setIdEmpleado(++id);
        usuarios.add(usuario);
    }

    public void delete(int id) throws Exception {
        Usuario toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el usuario");
        }
        usuarios.remove(toBeDeleted);
    }

    public Usuario findById(int id) {
        for (Usuario d : usuarios) {
            if (d.getIdEmpleado() == id) {
                return d;
            }
        }
        return null;
    }

    public void update(Usuario usuario, int id) throws Exception {
        Usuario toBeDeleted = findById(id);
        if (toBeDeleted == null) {
            throw new Exception("No se encontro el usuario");
        }
        toBeDeleted.setNombreUsuario(usuario.getNombreUsuario());
        //todo: agregar los demás atributos
    }
}
