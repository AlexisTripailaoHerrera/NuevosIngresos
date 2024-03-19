package cl.amisoft.nuevosingresos.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuarios_eliminados", schema = "actividad")
@SequenceGenerator(name = "actividad.usuarios_eliminados_id_seq", sequenceName = "actividad.usuarios_eliminados_id_seq", allocationSize = 1)
public class UsuariosEliminados {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actividad.usuarios_eliminados_id_seq")
    private Long id;
    @Column(name = "GLS_N_ELIMINADO")
    private String nombreEliminado;
    @Column(name = "GLS_A_ELIMINADO")
    private String apellidoEliminado;
    @Column(name = "RUT_ELIMINADO")
    private Long rutEliminado;
    @Column(name = "RUT_DV_ELIMINADO")
    private Character rutDvEliminado;
    @Column(name = "USERNAME_ELIMINADO")
    private String usernameEliminado;
    @Column(name = "GLS_N_ELIMINADOR")
    private String nombreEliminador;
    @Column(name = "GLS_A_ELIMINADOR")
    private String apellidoEliminador;
    @Column(name = "RUT_ELIMINADOR")
    private Long rutEliminador;
    @Column(name = "RUT_DV_ELIMINADOR")
    private Character rutDvEliminador;
    @Column(name = "FEC_ELIMINACION", insertable = false, updatable = false)
    private LocalDate fechaEliminacion;

    @PrePersist
    protected void onCreate(){
        fechaEliminacion = LocalDate.now();
    }

    public UsuariosEliminados(){
    }

    public UsuariosEliminados(Builder builder){
        this.id = builder.id;
        this.nombreEliminado = builder.nombreEliminado;
        this.apellidoEliminado = builder.apellidoEliminado;
        this.rutEliminado = builder.rutEliminado;
        this.rutDvEliminado = builder.rutDvEliminado;
        this.usernameEliminado = builder.usernameEliminado;
        this.nombreEliminador = builder.nombreEliminador;
        this.apellidoEliminador = builder.apellidoEliminador;
        this.rutEliminador = builder.rutEliminador;
        this.rutDvEliminador = builder.rutDvEliminador;
        this.fechaEliminacion = builder.fechaEliminacion;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEliminado() {
        return nombreEliminado;
    }

    public void setNombreEliminado(String nombreEliminado) {
        this.nombreEliminado = nombreEliminado;
    }

    public String getApellidoEliminado() {
        return apellidoEliminado;
    }

    public void setApellidoEliminado(String apellidoEliminado) {
        this.apellidoEliminado = apellidoEliminado;
    }

    public Long getRutEliminado() {
        return rutEliminado;
    }

    public void setRutEliminado(Long rutEliminado) {
        this.rutEliminado = rutEliminado;
    }

    public Character getRutDvEliminado() {
        return rutDvEliminado;
    }

    public void setRutDvEliminado(Character rutDvEliminado) {
        this.rutDvEliminado = rutDvEliminado;
    }

    public String getUsernameEliminado() {
        return usernameEliminado;
    }

    public void setUsernameEliminado(String usernameEliminado) {
        this.usernameEliminado = usernameEliminado;
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

    public LocalDate getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(LocalDate fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public static class Builder {
        private Long id;
        private String nombreEliminado;
        private String apellidoEliminado;
        private Long rutEliminado;
        private Character rutDvEliminado;
        private String usernameEliminado;
        private String nombreEliminador;
        private String apellidoEliminador;
        private Long rutEliminador;
        private Character rutDvEliminador;
        private LocalDate fechaEliminacion;


        public Builder ido(Long id){
            this.id = id;
            return this;
        }

        public Builder nombreEliminado(String nombreEliminado){
            this.nombreEliminado = nombreEliminado;
            return this;
        }

        public Builder apellidoEliminado(String apellidoEliminado){
            this.apellidoEliminado = apellidoEliminado;
            return this;
        }

        public Builder rutEliminado(Long rutEliminado){
            this.rutEliminado = rutEliminado;
            return this;
        }

        public Builder rutDvEliminado(Character rutDvEliminado){
            this.rutDvEliminado = rutDvEliminado;
            return this;
        }

        public Builder usernameEliminado(String usernameEliminado){
            this.usernameEliminado = usernameEliminado;
            return this;
        }

        public Builder nombreEliminador(String nombreEliminador){
            this.nombreEliminador = nombreEliminador;
            return this;
        }

        public Builder apellidoEliminador(String apellidoEliminador){
            this.apellidoEliminador = apellidoEliminador;
            return this;
        }

        public Builder rutEliminador(Long rutEliminador){
            this.rutEliminador = rutEliminador;
            return this;
        }

        public Builder rutDvEliminador(Character rutDvEliminador){
            this.rutDvEliminador = rutDvEliminador;
            return this;
        }

        public Builder fechaEliminacion(LocalDate fechaEliminacion){
            this.fechaEliminacion = fechaEliminacion;
            return this;
        }

        public UsuariosEliminados build(){
            return new UsuariosEliminados(this);
        }
    }

}
