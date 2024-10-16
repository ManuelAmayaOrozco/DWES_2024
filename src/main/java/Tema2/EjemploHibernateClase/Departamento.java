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
}
