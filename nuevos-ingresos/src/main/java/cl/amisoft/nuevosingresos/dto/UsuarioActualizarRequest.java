package cl.amisoft.nuevosingresos.dto;

public class UsuarioActualizarRequest {
    private Long id;
    private String nuevoNombre;
    private String nuevoApellido;
    private Long nuevoRut;
    private Character nuevoDv;
    private String nombreModificador;
    private String apellidoModificador;
    private Long rutModificador;
    private Character rutDvModificador;
    private Long idModificador;

    public UsuarioActualizarRequest(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNuevoNombre() {
        return nuevoNombre;
    }

    public void setNuevoNombre(String nuevoNombre) {
        this.nuevoNombre = nuevoNombre;
    }

    public String getNuevoApellido() {
        return nuevoApellido;
    }

    public void setNuevoApellido(String nuevoApellido) {
        this.nuevoApellido = nuevoApellido;
    }

    public Long getNuevoRut() {
        return nuevoRut;
    }

    public void setNuevoRut(Long nuevoRut) {
        this.nuevoRut = nuevoRut;
    }

    public Character getNuevoDv() {
        return nuevoDv;
    }

    public void setNuevoDv(Character nuevoDv) {
        this.nuevoDv = nuevoDv;
    }

    public String getNombreModificador() {
        return nombreModificador;
    }

    public void setNombreModificador(String nombreModificador) {
        this.nombreModificador = nombreModificador;
    }

    public String getApellidoModificador() {
        return apellidoModificador;
    }

    public void setApellidoModificador(String apellidoModificador) {
        this.apellidoModificador = apellidoModificador;
    }

    public Long getRutModificador() {
        return rutModificador;
    }

    public void setRutModificador(Long rutModificador) {
        this.rutModificador = rutModificador;
    }

    public Character getRutDvModificador() {
        return rutDvModificador;
    }

    public void setRutDvModificador(Character rutDvModificador) {
        this.rutDvModificador = rutDvModificador;
    }

    public Long getIdModificador() {
        return idModificador;
    }

    public void setIdModificador(Long idModificador) {
        this.idModificador = idModificador;
    }
}

