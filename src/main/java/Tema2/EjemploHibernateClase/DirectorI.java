package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

@Entity
@Table(name = "director")
public class DirectorI {

    @Id
    private String dni;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "saldo")
    private Double saldo;

    @OneToOne(mappedBy = "directori", fetch = FetchType.EAGER)
    private Instituto instituto;

}
