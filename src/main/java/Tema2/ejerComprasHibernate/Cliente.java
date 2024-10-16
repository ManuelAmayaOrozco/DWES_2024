package Tema2.ejerComprasHibernate;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column (name = "email", nullable = false, length = 50)
    private String email;

    @OneToMany (mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Compra> compras;

}
