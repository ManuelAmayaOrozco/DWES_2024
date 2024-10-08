package Tema2.EjemploProductos.Repository;

import Tema2.EjemploProductos.Model.Empleado;
import Tema2.EjemploProductos.Model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepository implements GenericRepositoryAPI<String, Producto> {

        ArrayList<Producto> bdProductos;

    public ProductoRepository() {
        this.bdProductos = new ArrayList<>();
        bdProductos.add(new Producto("JSDFJSJG","Caja Cartón", 1.12,1));
    }

    //C
    public Producto insert(Producto empleado) {

        bdProductos.add(empleado);

        // return bddUserEmail.stream().filter(u -> u.getEmail().equals(u.getEmail())).findFirst().orElse(null);
        return get(empleado.getId());

    }

    //R
    public Producto get(String key) {

        //return bddUserEmail.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
        Producto productoReturn = null;

        for (Producto p : bdProductos) {

            if (p.getId().equals(key)) {

                productoReturn = p;
                break;

            }

        }

        return productoReturn;

    }

    public List<Producto> getAll() {

        return new ArrayList<Producto>(bdProductos);

    }

    //U
    //TODO: hacer U

    //D
    public void delete(String key) {

        bdProductos.remove(get(key));

    }

}
