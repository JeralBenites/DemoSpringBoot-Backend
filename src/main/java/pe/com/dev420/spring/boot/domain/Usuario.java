package pe.com.dev420.spring.boot.domain;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUsuario")
    @SequenceGenerator(name = "seqUsuario", allocationSize = 1, sequenceName = "SEQ_USUARIO")
    @Column(name = "ID_USUARIO")
    private long id;

    private String usuario;

    private String clave;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", usuario=" + usuario + ", clave=" + clave + "]";
    }

}