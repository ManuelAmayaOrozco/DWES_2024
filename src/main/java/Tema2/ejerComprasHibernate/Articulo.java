package Tema2.ejerComprasHibernate;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "articulo")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column (name = "pais", nullable = false)
    private String pais;

    @Column (name = "stock")
    private int stock;

    @ManyToMany(mappedBy = "articulos")
    private List<DetalleCompra> detalleCompras;

    @ManyToMany
    @JoinTable(name = "art_proveedores",
            joinColumns = @JoinColumn(name = "id_articulo"),
            inverseJoinColumns = @JoinColumn(name = "id_proveedor"))
    private List<Proveedor> proveedores;

}
