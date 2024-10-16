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

    public Proveedor() {



    }

    public Proveedor(String nombre, String materiales, int stock, List<Instituto> insitutos) {
        this.nombre = nombre;
        this.materiales = materiales;
        this.stock = stock;
        this.insitutos = insitutos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Instituto> getInsitutos() {
        return insitutos;
    }

    public void setInsitutos(List<Instituto> insitutos) {
        this.insitutos = insitutos;
    }
}
