package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

@Entity
@Table(name = "cine")
public class Cine {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column (name = "capacidad", nullable = false)
    private int capacidad;

    @Column (name = "direccion", nullable = false)
    private String direccion;

    public Cine() {



    }

    public Cine(Long id, String nombre, int capacidad, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.direccion = direccion;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
