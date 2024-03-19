package cl.amisoft.nuevosingresos.dto;

public class UsuarioCrearRequest {

    private String nombre;
    private String apellido;
    private Long rut;
    private Character rutDv;
    private String username;
    private String password;
    private Long idCreador;
    private String nombreCreador;
    private String apellidoCreador;
    private Long rutCreador;
    private Character rutDvCreador;

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

    public Character getRutDv() {
        return rutDv;
    }

    public void setRutDv(Character rutDv) {
        this.rutDv = rutDv;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getIdCreador() {
        return idCreador;
    }

    public void setIdCreador(Long idCreador) {
        this.idCreador = idCreador;
    }

    public String getNombreCreador() {
        return nombreCreador;
    }

    public void setNombreCreador(String nombreCreador) {
        this.nombreCreador = nombreCreador;
    }

    public String getApellidoCreador() {
        return apellidoCreador;
    }

    public void setApellidoCreador(String apellidoCreador) {
        this.apellidoCreador = apellidoCreador;
    }

    public Long getRutCreador() {
        return rutCreador;
    }

    public void setRutCreador(Long rutCreador) {
        this.rutCreador = rutCreador;
    }

    public Character getRutDvCreador() {
        return rutDvCreador;
    }

    public void setRutDvCreador(Character rutDvCreador) {
        this.rutDvCreador = rutDvCreador;
    }
}
