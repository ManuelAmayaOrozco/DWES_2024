package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

@Entity
@Table (name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column (name = "profesores")
    private int profesores;

    @ManyToOne
    @JoinColumn (name = "nombre_instituto")
    private Instituto instituto;

    public Departamento() {



    }

    public Departamento(String nombre, int profesores, Instituto instituto) {
        this.nombre = nombre;
        this.profesores = profesores;
        this.instituto = instituto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProfesores() {
        return profesores;
    }

    public void setProfesores(int profesores) {
        this.profesores = profesores;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }
}
