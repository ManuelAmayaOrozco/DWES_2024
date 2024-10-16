package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "instituto")
public class Instituto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column (name = "alumnos")
    private int nAlumnos;

    @ManyToOne (cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "inspector")
    private Inspector inspector;

    @OneToOne (cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "directori")
    private DirectorI directori;

    @OneToMany (mappedBy = "instituto", fetch = FetchType.EAGER)
    private List<Departamento> departamentos;

    @ManyToMany
    @JoinTable(name = "proveedores",
            joinColumns = @JoinColumn(name = "nombre_instituto"),
            inverseJoinColumns = @JoinColumn(name = "nombre_proveedor"))
    private List<Proveedor> proveedores;

}
