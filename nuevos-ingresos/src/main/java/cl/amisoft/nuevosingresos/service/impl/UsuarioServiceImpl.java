package cl.amisoft.nuevosingresos.service.impl;

import cl.amisoft.nuevosingresos.dao.UsuarioDao;
import cl.amisoft.nuevosingresos.model.Usuario;
import cl.amisoft.nuevosingresos.service.UsuarioService;
import cl.amisoft.nuevosingresos.vo.UsuarioVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioDao usuarioDao;

    @Autowired
    public UsuarioServiceImpl(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public List<UsuarioVo> login(String username, String password){
        List<UsuarioVo> datosUsuario = new ArrayList<>();
        Optional<Usuario> usuario = usuarioDao.login(username, password);
        if (usuario.isPresent()){
            Usuario usuarioEncontrado = usuario.get();
            datosUsuario.add(new UsuarioVo.Builder()
                    .id(usuarioEncontrado.getId())
                    .nombreUsuario(usuarioEncontrado.getNombreUsuario())
                    .apellidoUsuario(usuarioEncontrado.getApellidoUsuario())
                    .rut(usuarioEncontrado.getRut())
                    .rutDV(usuarioEncontrado.getRutDV())
                    .build());
        }
        return datosUsuario;
    }

    @Override
    public UsuarioVo obtenerUsuario(Long id){
        Optional<Usuario> usuario = usuarioDao.obtenerUsuario(id);
        if (usuario.isPresent()){
            return new UsuarioVo.Builder()
                    .id(usuario.get().getId())
                    .nombreUsuario(usuario.get().getNombreUsuario())
                    .apellidoUsuario(usuario.get().getApellidoUsuario())
                    .rut(usuario.get().getRut())
                    .rutDV(usuario.get().getRutDV())
                    .username(usuario.get().getUsername())
                    .fechaCreacion(usuario.get().getFechaCreacion())
                    .idCreador(usuario.get().getIdCreador())
                    .nombreCreador(usuario.get().getNombreCreador())
                    .apellidoCreador(usuario.get().getApellidoCreador())
                    .rutCreador(usuario.get().getRutCreador())
                    .rutDvCreador(usuario.get().getRutDvCreador())
                    .fechaModificacion(usuario.get().getFechaModificacion())
                    .nombreModificacion(usuario.get().getNombreModificacion())
                    .apellidoModificacion(usuario.get().getApellidoModificacion())
                    .rutMod(usuario.get().getRutMod())
                    .rutDvMod(usuario.get().getRutDvMod())
                    .idMod(usuario.get().getIdMod())
                    .build();
        }
        return new UsuarioVo();
    }

    @Override
    public List<UsuarioVo> obtenerTodosLosUsuarios() {
        List<Usuario> usuarios = usuarioDao.obtenerTodosLosUsuarios();
        if (!usuarios.isEmpty()) {
            return usuarios.stream().map(u -> new UsuarioVo.Builder()
                    .id(u.getId())
                    .nombreUsuario(u.getNombreUsuario())
                    .apellidoUsuario(u.getApellidoUsuario())
                    .rut(u.getRut())
                    .rutDV(u.getRutDV())
                    .username(u.getUsername())
                    .password(u.getPassword())
                    .fechaCreacion(u.getFechaCreacion())
                    .idCreador(u.getIdCreador())
                    .nombreCreador(u.getNombreCreador())
                    .apellidoCreador(u.getApellidoCreador())
                    .rutCreador(u.getRutCreador())
                    .rutDvCreador(u.getRutDvCreador())
                    .fechaModificacion(u.getFechaModificacion())
                    .nombreModificacion(u.getNombreModificacion())
                    .apellidoModificacion(u.getApellidoModificacion())
                    .rutMod(u.getRutMod())
                    .rutDvMod(u.getRutDvMod())
                    .idMod(u.getIdMod())
                    .build()).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    @Transactional
    public String crearUsuario(String nombre, String apellido, Long rut, Character rutDv, String username,
                               String password, Long idCreador, String nombreCreador, String apellidoCreador, Long rutCreador, Character rutDvCreador) {
        usuarioDao.crearUsuario(nombre, apellido, rut, rutDv, username, password, idCreador, nombreCreador, apellidoCreador, rutCreador, rutDvCreador);
        return "Usuario creado exitosamente";
    }

    @Override
    @Transactional
    public String actualizarUsuario (Long id, String nuevoNombre, String nuevoApellido, Long nuevoRut,
                                     Character nuevoDv, String nombreModificador, String apellidoModificador, Long rutModificador,
                                     Character rutDvModificador, Long idModificador){
        usuarioDao.actualizarUsuario(id, nuevoNombre, nuevoApellido, nuevoRut, nuevoDv, nombreModificador, apellidoModificador, rutModificador,
                rutDvModificador, idModificador);
        return "Usuario actualizado correctamente";
    }

    @Override
    @Transactional
    public String eliminarUsuario (Long id, String nombreEliminador, String apellidoEliminador,
                                   Long rutEliminador, Character rutDvEliminador){
        usuarioDao.eliminarUsuario(id, nombreEliminador, apellidoEliminador, rutEliminador, rutDvEliminador);
        return "Usuario eliminado correctamente";
    }
}

