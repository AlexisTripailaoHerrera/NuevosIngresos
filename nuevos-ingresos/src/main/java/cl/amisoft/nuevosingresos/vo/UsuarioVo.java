package cl.amisoft.nuevosingresos.vo;

import java.io.Serializable;
import java.time.LocalDate;

public class UsuarioVo implements Serializable {
    private static final long serialVersionUID = -8109351845131242564L;
    private Long id;
    private String nombreUsuario;
    private String apellidoUsuario;
    private Long rut;
    private Character rutDV;
    private String username;
    private String password;
    private LocalDate fechaCreacion;
    private Long idCreador;
    private String nombreCreador;
    private String apellidoCreador;
    private Long rutCreador;
    private Character rutDvCreador;

    private LocalDate fechaModificacion;
    private String nombreModificacion;
    private String apellidoModificacion;
    private Long rutMod;
    private Character rutDvMod;
    private Long idMod;

    public UsuarioVo() {
    }

    public UsuarioVo(Builder builder) {
        this.id = builder.id;
        this.nombreUsuario = builder.nombreUsuario;
        this.apellidoUsuario = builder.apellidoUsuario;
        this.rut = builder.rut;
        this.rutDV = builder.rutDV;
        this.username = builder.username;
        this.password = builder.password;
        this.fechaCreacion = builder.fechaCreacion != null ? builder.fechaCreacion : LocalDate.now();
        this.idCreador = builder.idCreador;
        this.nombreCreador = builder.nombreCreador;
        this.apellidoCreador = builder.apellidoCreador;
        this.rutCreador = builder.rutCreador;
        this.rutDvCreador = builder.rutDvCreador;
        this.fechaModificacion = builder.fechaModificacion != null ? builder.fechaModificacion : LocalDate.now();
        this.nombreModificacion = builder.nombreModificacion;
        this.apellidoModificacion = builder.apellidoModificacion;
        this.rutMod = builder.rutMod;
        this.rutDvMod = builder.rutDvMod;
        this.idMod = builder.idMod;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public Long getRut() {
        return rut;
    }

    public void setRut(Long rut) {
        this.rut = rut;
    }

    public Character getRutDV() {
        return rutDV;
    }

    public void setRutDV(Character rutDV) {
        this.rutDV = rutDV;
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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getNombreModificacion() {
        return nombreModificacion;
    }

    public void setNombreModificacion(String nombreModificacion) {
        this.nombreModificacion = nombreModificacion;
    }

    public String getApellidoModificacion() {
        return apellidoModificacion;
    }

    public void setApellidoModificacion(String apellidoModificacion) {
        this.apellidoModificacion = apellidoModificacion;
    }

    public Long getRutMod() {
        return rutMod;
    }

    public void setRutMod(Long rutMod) {
        this.rutMod = rutMod;
    }

    public Character getRutDvMod() {
        return rutDvMod;
    }

    public void setRutDvMod(Character rutDvMod) {
        this.rutDvMod = rutDvMod;
    }

    public Long getIdMod() {
        return idMod;
    }

    public void setIdMod(Long idMod) {
        this.idMod = idMod;
    }

    public static class Builder {
        private Long id;
        private String nombreUsuario;
        private String apellidoUsuario;
        private Long rut;
        private Character rutDV;
        private String username;
        private String password;
        private LocalDate fechaCreacion;
        private Long idCreador;
        private String nombreCreador;
        private String apellidoCreador;
        private Long rutCreador;
        private Character rutDvCreador;
        private LocalDate fechaModificacion;
        private String nombreModificacion;
        private String apellidoModificacion;
        private Long rutMod;
        private Character rutDvMod;
        private Long idMod;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder nombreUsuario(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
            return this;
        }

        public Builder apellidoUsuario(String apellidoUsuario) {
            this.apellidoUsuario = apellidoUsuario;
            return this;
        }

        public Builder rut(Long rut) {
            this.rut = rut;
            return this;
        }

        public Builder rutDV(Character rutDV) {
            this.rutDV = rutDV;
            return this;
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder fechaCreacion(LocalDate fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
            return this;
        }

        public Builder idCreador(Long idCreador){
            this.idCreador = idCreador;
            return this;
        }

        public Builder nombreCreador(String nombreCreador){
            this.nombreCreador = nombreCreador;
            return this;
        }

        public Builder apellidoCreador(String apellidoCreador){
            this.apellidoCreador = apellidoCreador;
            return this;
        }

        public Builder rutCreador(Long rutCreador){
            this.rutCreador = rutCreador;
            return this;
        }

        public Builder rutDvCreador(Character rutDvCreador){
            this.rutDvCreador = rutDvCreador;
            return this;
        }

        public Builder fechaModificacion(LocalDate fechaModificacion) {
            this.fechaModificacion = fechaModificacion;
            return this;
        }

        public Builder nombreModificacion(String nombreModificacion) {
            this.nombreModificacion = nombreModificacion;
            return this;
        }

        public Builder apellidoModificacion(String apellidoModificacion) {
            this.apellidoModificacion = apellidoModificacion;
            return this;
        }

        public Builder rutMod(Long rutMod){
            this.rutMod = rutMod;
            return this;
        }

        public Builder rutDvMod(Character rutDvMod){
            this.rutDvMod = rutDvMod;
            return this;
        }

        public Builder idMod(Long idMod){
            this.idMod = idMod;
            return this;
        }

        public UsuarioVo build() {
            return new UsuarioVo(this);
        }
    }
}

