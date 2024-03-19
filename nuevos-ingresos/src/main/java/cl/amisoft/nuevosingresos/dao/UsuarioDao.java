package cl.amisoft.nuevosingresos.dao;

import cl.amisoft.nuevosingresos.model.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Repository
public class UsuarioDao {

    @PersistenceContext
    protected EntityManager em;

    public List<Usuario> obtenerTodosLosUsuarios() {
        List resultList = em.createQuery("SELECT u FROM Usuario u", Usuario.class)
                .getResultList();
        if (!resultList.isEmpty()) {
            return resultList;
        }
        return Collections.emptyList();
    }

    public String crearUsuario(String nombre, String apellido, Long rut, char rutDv, String username, String password,
                               Long idCreador, String nombreCreador, String apellidoCreador, Long rutCreador,
                               Character rutDvCreador) {
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(nombre);
        usuario.setApellidoUsuario(apellido);
        usuario.setRut(rut);
        usuario.setRutDV(rutDv);
        usuario.setUsername(username);
        usuario.setPassword(password);
        usuario.setIdCreador(idCreador);
        usuario.setNombreCreador(nombreCreador);
        usuario.setApellidoCreador(apellidoCreador);
        usuario.setRutCreador(rutCreador);
        usuario.setRutDvCreador(rutDvCreador);
        em.persist(usuario);
        return "Usuario creado exitosamente";
    }

    public String actualizarUsuario (Long id, String nuevoNombre, String nuevoApellido, Long nuevoRut,
                                     Character nuevoDv, String nombreModificador, String apellidoModificador,
                                     Long rutModificador, Character rutDvModificador, Long idModificador){
        Usuario usuario = em.find(Usuario.class, id);
        if(usuario != null){
            usuario.setNombreUsuario(nuevoNombre);
            usuario.setApellidoUsuario(nuevoApellido);
            usuario.setRut(nuevoRut);
            usuario.setRutDV(nuevoDv);
            usuario.setNombreModificacion(nombreModificador);
            usuario.setApellidoModificacion(apellidoModificador);
            usuario.setRutMod(rutModificador);
            usuario.setRutDvMod(rutDvModificador);
            usuario.setIdMod(idModificador);
            em.merge(usuario);
            return "Usuario actualizado correctamente";
        }else{
            return "No se encontró el usuario";
        }
    }

}
