package Tema2.Ejercicio3.Services;

import Tema2.Ejercicio3.Clases.User;
import Tema2.Ejercicio3.Repositorios.UserRepository;

public class UserService {

    /*
    El service se encarga de la logica de negocio
     */

    UserRepository userRepository = new UserRepository(null);

    public boolean deleteUser(String nombre) {

        //El nombre es obligatorio
        if (nombre == null || nombre.isEmpty()) return false;

        //Comprobar que el usuario existe en la base de datos
        //TODO: Llamar al metodo del Repository .getUser()
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
        if (nombre == null || nombre.isEmpty() || nombre.length() > 255) return false;

        //Comprobar que el usuario existe en la base de datos
        User u = userRepository.findUser(nombre);
        return u != null;

    }

    public boolean insertUser(String nombre, String pass) {

        //El nombre y la contraseña son obligatorios
        if (nombre == null || nombre.isEmpty() || pass == null || pass.isEmpty() || nombre.length() > 255) return false;

        //Comprobar si el usuario existe en la base de datos
        User u = userRepository.findUser(nombre);
        if (u != null) {

            return false;

        }

        //Añadir el usuario y comprobar que el usuario se ha añadido correctamente
        userRepository.addUser(nombre, pass);
        return userRepository.findUser(nombre) != null;

    }

}
