package pe.com.dev420.spring.boot.domain;

import javax.persistence.*;

@Entity
public class Album {

    @Id
    @Column(name = "CODIGO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAlbum")
    @SequenceGenerator(name = "seqAlbum", allocationSize = 1, sequenceName = "SEQ_ALBUM")
    private long codigo;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "ESTADO")
    private String estado;

    public Album() {
        super();
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Album [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado
                + "]";
    }

}
