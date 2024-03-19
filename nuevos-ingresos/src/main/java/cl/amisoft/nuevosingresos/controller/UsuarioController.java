package cl.amisoft.nuevosingresos.controller;

import cl.amisoft.nuevosingresos.dto.UsuarioCrearRequest;
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

    @GetMapping(produces = "application/json")
    public List<UsuarioVo> obtenerTodosLosUsuarios() {
        return usuarioService.obtenerTodosLosUsuarios();
    }

    @PostMapping(consumes = "application/json")
    public String crearUsuario(@RequestBody UsuarioCrearRequest request) {
        usuarioService.crearUsuario(request.getNombre(), request.getApellido(), request.getRut(), request.getRutDv());
        return "Usuario creado exitosamente";
    }
}

