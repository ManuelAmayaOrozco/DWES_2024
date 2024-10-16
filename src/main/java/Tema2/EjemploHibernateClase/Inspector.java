package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "inspector")
public class Inspector {

    @Id
    private String dni;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "saldo")
    private Double saldo;

    @OneToMany(mappedBy = "inspector", fetch = FetchType.EAGER)
    private List<Instituto> institutos;

}
