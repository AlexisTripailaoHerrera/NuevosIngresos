package cl.amisoft.nuevosingresos.service;

import cl.amisoft.nuevosingresos.vo.UsuarioVo;

import java.util.List;

public interface UsuarioService {
    List<UsuarioVo> obtenerTodosLosUsuarios();

    String crearUsuario(String nombre, String apellido, Long rut, char rutDv, String username, String password, Long idCreador, String nombreCreador, String apellidoCreador, Long rutCreador, Character rutDvCreador);


}
