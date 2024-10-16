package Tema2.EjemploHibernateClase;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "instituto")
public class Instituto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column (name = "alumnos")
    private int nAlumnos;

    @ManyToOne (cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_inspector")
    private Inspector inspector;

    @OneToOne (cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_director")
    private DirectorI directori;

    @OneToMany (mappedBy = "instituto", fetch = FetchType.EAGER)
    private List<Departamento> departamentos;

    @ManyToMany
    @JoinTable(name = "proveedores_instituto",
            joinColumns = @JoinColumn(name = "id_instituto"),
            inverseJoinColumns = @JoinColumn(name = "id_proveedor"))
    private List<Proveedor> proveedores;

    public Instituto() {


    }

    public Instituto(String nombre, int nAlumnos, Inspector inspector, List<Departamento> departamentos, DirectorI directori, List<Proveedor> proveedores) {
        this.nombre = nombre;
        this.nAlumnos = nAlumnos;
        this.inspector = inspector;
        this.departamentos = departamentos;
        this.directori = directori;
        this.proveedores = proveedores;
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

    public int getnAlumnos() {
        return nAlumnos;
    }

    public void setnAlumnos(int nAlumnos) {
        this.nAlumnos = nAlumnos;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public DirectorI getDirectori() {
        return directori;
    }

    public void setDirectori(DirectorI directori) {
        this.directori = directori;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
}
