package Tema2.Ejercicio1.Clases;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String contrasenia;

    public Persona(String nombre, String contrasenia) {

        this.nombre = nombre;
        this.contrasenia = contrasenia;

    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona user = (Persona) o;
        return Objects.equals(nombre, user.nombre) && Objects.equals(contrasenia, user.contrasenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, contrasenia);
    }
}
