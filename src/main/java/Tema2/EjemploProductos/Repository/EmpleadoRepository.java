package Tema2.EjemploProductos.Repository;

import Tema2.EjemploProductos.Model.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository implements GenericRepositoryAPI<String, Empleado>{

    ArrayList<Empleado> bdEmpleados;

    public EmpleadoRepository() {
        this.bdEmpleados = new ArrayList<Empleado>();
        bdEmpleados.add(new Empleado("JSDFJSJG","Diego", "DWES","diego@diego.es"));
    }

    //C
    public Empleado insert(Empleado empleado) {

        bdEmpleados.add(empleado);

        // return bddUserEmail.stream().filter(u -> u.getEmail().equals(u.getEmail())).findFirst().orElse(null);
        return get(empleado.getDni());

    }

    //R
    public Empleado get(String key) {

        //return bddUserEmail.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
        Empleado empleadoReturn = null;

        for (Empleado e : bdEmpleados) {

            if (e.getDni().equals(key)) {

                empleadoReturn = e;
                break;

            }

        }

        return empleadoReturn;

    }

    public List<Empleado> getAll() {

        return new ArrayList<Empleado>(bdEmpleados);

    }

    //U
    //TODO: hacer U

    //D
    public void delete(String key) {

        bdEmpleados.remove(get(key));

    }

}
