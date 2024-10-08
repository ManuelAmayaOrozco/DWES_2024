package Tema2.EjemploProductos.Model;

import java.util.Objects;

public class Empleado {

    private String dni;
    private String nombre;
    private String dpto;
    private String email;

    public Empleado(String dni, String nombre, String dpto, String emmail) {
        this.dni = dni;
        this.nombre = nombre;
        this.dpto = dpto;
        this.email = emmail;
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

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(dni, empleado.dni) && Objects.equals(nombre, empleado.nombre) && Objects.equals(dpto, empleado.dpto) && Objects.equals(email, empleado.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, dpto, email);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dpto='" + dpto + '\'' +
                ", emmail='" + email + '\'' +
                '}';
    }
}
