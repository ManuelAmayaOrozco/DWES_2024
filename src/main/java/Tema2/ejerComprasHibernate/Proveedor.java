package Tema2.ejerComprasHibernate;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", nullable = false)
    private String nombre;

    @Column (name = "pais", nullable = false)
    private String pais;

    @ManyToMany(mappedBy = "proveedores")
    private List<Articulo> articulos;

}
