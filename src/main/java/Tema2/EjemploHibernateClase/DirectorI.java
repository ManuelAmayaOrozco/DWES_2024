package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

@Entity
@Table(name = "director")
public class DirectorI {

    @Id
    private String dni;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "saldo")
    private Double saldo;

    @OneToOne(mappedBy = "directori", fetch = FetchType.EAGER)
    private Instituto instituto;

    public DirectorI() {



    }

    public DirectorI(String dni, String nombre, int edad, Double saldo, Instituto instituto) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
        this.instituto = instituto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }
}
