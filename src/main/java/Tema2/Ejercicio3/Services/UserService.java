package Tema2.Ejercicio3.Services;

import Tema2.Ejercicio3.Clases.User;
import Tema2.Ejercicio3.Repositorios.UserRepository;

public class UserService {

    /*
    El service se encarga de la logica de negocio
     */

    public boolean deleteUser(String nombre) {

        //El nombre es obligatorio
        if (nombre == null || nombre.isEmpty()) return false;

        //Comprobar que el usuario existe en la base de datos
        //TODO: Llamar al metodo del Repository .getUser()
        UserRepository userRepository = new UserRepository(null);
        User u = userRepository.findUser(nombre);
        if (u == null) {

            return false;

        }

        //Eliminar el usuario y comprobar que el usuario se ha eliminado correctamente
        //TODO: Llamar al método del Repository .deleteUser() y después llamar a .getUser()
        userRepository.eraseUser(u);
        return userRepository.findUser(nombre) == null;

    }

    public boolean getUser(String nombre) {

        //El nombre es obligatorio
        if (nombre == null || nombre.isEmpty()) return false;

        //Comprobar que el usuario existe en la base de datos
        UserRepository userRepository = new UserRepository(null);
        User u = userRepository.findUser(nombre);
        return u != null;

    }

}
