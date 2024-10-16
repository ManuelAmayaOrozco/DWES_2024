package Tema2.ejerComprasHibernate;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn (name = "id_cliente")
    private Cliente cliente;

    @OneToMany (mappedBy = "compra", fetch = FetchType.LAZY)
    private List<DetalleCompra> detalles;
}
