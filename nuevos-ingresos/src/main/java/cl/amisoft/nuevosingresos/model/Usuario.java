package cl.amisoft.nuevosingresos.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuarios", schema = "actividad")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "GLS_USUARIO_N")
    private String nombreUsuario;

    @Column(name = "GLS_USUARIO_A")
    private String apellidoUsuario;

    @Column(name = "FEC_CREA", insertable = false, updatable = false)
    private LocalDate fechaCreacion;

    @Column(name = "RUT")
    private Long rut;

    @Column(name = "RUT_DV")
    private Character rutDV;

    @Column(name = "FEC_MOD", insertable = false)
    private LocalDate fechaModificacion;

    @Column(name = "GLS_NOMBRE_MOD")
    private String nombreModificacion;

    @Column(name = "GLS_APELLIDO_MOD")
    private String apellidoModificacion;

    @PrePersist
    protected void onCreate() {
        fechaCreacion = LocalDate.now();
    }

    @PreUpdate
    protected void onUpdate() {
        fechaModificacion = LocalDate.now();
    }


    public Usuario() {
    }

    public Usuario(Builder builder) {
        this.id = builder.id;
        this.nombreUsuario = builder.nombreUsuario;
        this.apellidoUsuario = builder.apellidoUsuario;
        this.fechaCreacion = builder.fechaCreacion;
        this.rut = builder.rut;
        this.rutDV = builder.rutDV;
        this.fechaModificacion = builder.fechaModificacion;
        this.nombreModificacion = builder.nombreModificacion;
        this.apellidoModificacion = builder.apellidoModificacion;
    }

    // Getters y Setters
    // Métodos constructor y Builder

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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

    public static class Builder {
        private Long id;
        private String nombreUsuario;
        private String apellidoUsuario;
        private LocalDate fechaCreacion;
        private Long rut;
        private Character rutDV;
        private LocalDate fechaModificacion;
        private String nombreModificacion;
        private String apellidoModificacion;

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

        public Builder fechaCreacion(LocalDate fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
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

        public Usuario build() {
            return new Usuario(this);
        }
    }
}

