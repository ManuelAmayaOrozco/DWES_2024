package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "titulo", length = 50, unique = true, nullable = false)
    private String titulo;

    @Column (name = "autor", length = 50, nullable = false)
    private String autor;

    @Transient
    private String autores;

    @Column (name = "fecha_lanzamiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaLanzamiento;

    public Pelicula() {



    }

    public Pelicula(Long id, String titulo, String autor, String autores, Date fechaLanzamiento) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.autores = autores;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
