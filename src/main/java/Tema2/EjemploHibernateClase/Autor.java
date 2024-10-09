package Tema2.EjemploHibernateClase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Autor {

    @Id
    private String dni;

    @Column
    private Integer nPeliculas;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getnPeliculas() {
        return nPeliculas;
    }

    public void setnPeliculas(Integer nPeliculas) {
        this.nPeliculas = nPeliculas;
    }

    public Autor() {

    }
}
