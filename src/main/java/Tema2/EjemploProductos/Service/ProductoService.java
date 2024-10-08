package Tema2.EjemploProductos.Service;

import Tema2.EjemploProductos.Model.Producto;
import Tema2.EjemploProductos.Repository.GenericRepositoryAPI;
import Tema2.EjemploProductos.Repository.ProductoRepository;

public class ProductoService {

    private GenericRepositoryAPI<String, Producto> repository;

    public ProductoService() {

        this.repository = new ProductoRepository();

    }

    public Producto insert(Producto newProduct) {

        //Hacemos las validaciones
        if (newProduct == null) {

            return null;

        }

        //Llamamos al insert del Repository
        return repository.insert(newProduct);

    }


}
