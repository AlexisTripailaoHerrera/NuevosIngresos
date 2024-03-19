package cl.amisoft.nuevosingresos.service.impl;

import cl.amisoft.nuevosingresos.dao.UsuarioDao;
import cl.amisoft.nuevosingresos.model.Usuario;
import cl.amisoft.nuevosingresos.service.UsuarioService;
import cl.amisoft.nuevosingresos.vo.UsuarioVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioDao usuarioDao;

    @Autowired
    public UsuarioServiceImpl(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public List<UsuarioVo> obtenerTodosLosUsuarios() {
        List<Usuario> usuarios = usuarioDao.obtenerTodosLosUsuarios();
        if (!usuarios.isEmpty()) {
            return usuarios.stream().map(u -> new UsuarioVo.Builder()
                    .id(u.getId())
                    .nombreUsuario(u.getNombreUsuario())
                    .apellidoUsuario(u.getApellidoUsuario())
                    .fechaCreacion(u.getFechaCreacion())
                    .rut(u.getRut())
                    .rutDV(u.getRutDV())
                    .fechaModificacion(u.getFechaModificacion())
                    .nombreModificacion(u.getNombreModificacion())
                    .apellidoModificacion(u.getApellidoModificacion())
                    .build()).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    @Override
    @Transactional
    public String crearUsuario(String nombre, String apellido, Long rut, char rutDv) {
        usuarioDao.crearUsuario(nombre, apellido, rut, rutDv);
        return "Usuario creado exitosamente";
    }
}

