package cl.amisoft.nuevosingresos.dto;

public class UsuarioCrearRequest {

    private String nombre;
    private String apellido;
    private Long rut;
    private char rutDv;

    // Constructor vacío necesario para deserialización JSON
    public UsuarioCrearRequest() {
    }

    // Getters y setters para todos los campos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getRut() {
        return rut;
    }

    public void setRut(Long rut) {
        this.rut = rut;
    }

    public char getRutDv() {
        return rutDv;
    }

    public void setRutDv(char rutDv) {
        this.rutDv = rutDv;
    }
}
