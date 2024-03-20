package cl.amisoft.nuevosingresos.service;

import cl.amisoft.nuevosingresos.model.Usuario;
import cl.amisoft.nuevosingresos.vo.UsuarioVo;

import java.util.List;

public interface UsuarioService {

    List<UsuarioVo> login(String username, String password);
    UsuarioVo obtenerUsuario(Long id);
    List<UsuarioVo> obtenerTodosLosUsuarios();

    String crearUsuario(String nombre, String apellido, Long rut, Character rutDv, String username, String password, Long idCreador, String nombreCreador, String apellidoCreador, Long rutCreador, Character rutDvCreador);

    String actualizarUsuario (Long id, String nuevoNombre, String nuevoApellido, Long nuevoRut, Character nuevoDv, String nombreModificador, String apellidoModificador, Long rutModificador, Character rutDvModificador, Long idModificador);

    String eliminarUsuario (Long id, String nombreEliminador, String apellidoEliminador, Long rutEliminador, Character rutDvEliminador);



}
