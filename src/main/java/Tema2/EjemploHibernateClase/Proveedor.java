package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "materiales", nullable = false)
    private String materiales;

    @Column(name = "stock")
    private int stock;

    @ManyToMany(mappedBy = "proveedores")
    private List<Instituto> insitutos;

}
