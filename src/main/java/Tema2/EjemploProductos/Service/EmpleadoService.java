package Tema2.EjemploProductos.Service;

import Tema2.EjemploProductos.Model.Empleado;
import Tema2.EjemploProductos.Repository.EmpleadoRepository;
import Tema2.EjemploProductos.Repository.GenericRepositoryAPI;

public class EmpleadoService {

    private GenericRepositoryAPI<String, Empleado> repository;

    public EmpleadoService() {

        this.repository = new EmpleadoRepository();

    }

}
