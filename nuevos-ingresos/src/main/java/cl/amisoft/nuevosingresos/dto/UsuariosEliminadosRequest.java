package cl.amisoft.nuevosingresos.dto;

import java.time.LocalDate;

public class UsuariosEliminadosRequest {
    private Long id;
    private String nombreEliminador;
    private String apellidoEliminador;
    private Long rutEliminador;
    private Character rutDvEliminador;

    public UsuariosEliminadosRequest(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEliminador() {
        return nombreEliminador;
    }

    public void setNombreEliminador(String nombreEliminador) {
        this.nombreEliminador = nombreEliminador;
    }

    public String getApellidoEliminador() {
        return apellidoEliminador;
    }

    public void setApellidoEliminador(String apellidoEliminador) {
        this.apellidoEliminador = apellidoEliminador;
    }

    public Long getRutEliminador() {
        return rutEliminador;
    }

    public void setRutEliminador(Long rutEliminador) {
        this.rutEliminador = rutEliminador;
    }

    public Character getRutDvEliminador() {
        return rutDvEliminador;
    }

    public void setRutDvEliminador(Character rutDvEliminador) {
        this.rutDvEliminador = rutDvEliminador;
    }
}
