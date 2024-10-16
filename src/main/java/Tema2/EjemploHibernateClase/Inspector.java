package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "inspector")
public class Inspector {

    @Id
    private String dni;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "saldo")
    private Double saldo;

    @OneToMany(mappedBy = "inspector", fetch = FetchType.EAGER)
    private List<Instituto> institutos;

    public Inspector() {



    }

    public Inspector(String dni, String nombre, int edad, Double saldo, List<Instituto> institutos) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
        this.institutos = institutos;
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

    public List<Instituto> getInstitutos() {
        return institutos;
    }

    public void setInstitutos(List<Instituto> institutos) {
        this.institutos = institutos;
    }
}
