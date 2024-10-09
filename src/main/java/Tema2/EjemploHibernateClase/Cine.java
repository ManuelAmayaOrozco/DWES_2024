package Tema2.EjemploHibernateClase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Cine {

    @Id
    private String id;

    @Column
    private String nombre;

    @Column
    private Integer nAsientos;

}
