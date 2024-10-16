package Tema2.ejerComprasHibernate;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "detalle_compra")
public class DetalleCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long apartado;

    @ManyToOne
    @JoinColumn (name = "id_compra", nullable = false)
    private Compra compra;

    @ManyToMany
    @JoinTable(name = "det_compra_articulos",
            joinColumns = @JoinColumn(name = "apartado_compra"),
            inverseJoinColumns = @JoinColumn(name = "id_articulo"))
    private List<Articulo> articulos;
}
