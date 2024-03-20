package cl.amisoft.nuevosingresos.controller;

import cl.amisoft.nuevosingresos.dto.LoginRequest;
import cl.amisoft.nuevosingresos.dto.UsuarioActualizarRequest;
import cl.amisoft.nuevosingresos.dto.UsuarioCrearRequest;
import cl.amisoft.nuevosingresos.dto.UsuariosEliminadosRequest;
import cl.amisoft.nuevosingresos.service.UsuarioService;
import cl.amisoft.nuevosingresos.vo.UsuarioVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(consumes = "application/json")
    public List<UsuarioVo> login(@RequestBody LoginRequest request){
        return usuarioService.login(request.getUsername(), request.getPassword());
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public UsuarioVo obtenerUsuario(@PathVariable(name = "id") Long id){
        return usuarioService.obtenerUsuario(id);
    }

    @GetMapping(produces = "application/json")
    public List<UsuarioVo> obtenerTodosLosUsuarios() {
        return usuarioService.obtenerTodosLosUsuarios();
    }

    @PostMapping(value = "/CrearUsuario", consumes = "application/json")
    public String crearUsuario(@RequestBody UsuarioCrearRequest request) {
        usuarioService.crearUsuario(request.getNombre(), request.getApellido(), request.getRut(),
                request.getRutDv(), request.getUsername(), request.getPassword(),
                request.getIdCreador(), request.getNombreCreador(), request.getApellidoCreador(), request.getRutCreador(), request.getRutDvCreador());
        return "Usuario creado exitosamente";
    }

    @PutMapping(consumes = "application/json")
    public String actualizarUsuario(@RequestBody UsuarioActualizarRequest request) {
        usuarioService.actualizarUsuario(request.getId(), request.getNuevoNombre(), request.getNuevoApellido(), request.getNuevoRut(), request.getNuevoDv(),
                request.getNombreModificador(), request.getApellidoModificador(), request.getRutModificador(), request.getRutDvModificador(), request.getIdModificador());
        return "Usuario actualizado correctamente";
    }

    @DeleteMapping(consumes = "application/json")
    public String eliminarUsuario (@RequestBody UsuariosEliminadosRequest request ){
        usuarioService.eliminarUsuario(request.getId(), request.getNombreEliminador(), request.getApellidoEliminador(),
                request.getRutEliminador(), request.getRutDvEliminador());
        return "Usuario eliminado correctamente";
    }


}

