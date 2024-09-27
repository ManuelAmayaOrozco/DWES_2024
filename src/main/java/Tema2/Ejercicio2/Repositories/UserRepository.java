package Tema2.Ejercicio2.Repositories;

import Tema2.Ejercicio1.Clases.Persona;
import Tema2.Ejercicio2.Clases.Respuesta;
import Tema2.Ejercicio2.Clases.User;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.System.in;

public class UserRepository {

    // Simula la BASE DE DATOS
    private final ArrayList<User> listaUsers;

    public UserRepository() {

        // Inicializas el ArrayList listaUsers
        listaUsers = new ArrayList<>();

    }

    // Add user

    public void addUser(String nombre, String password) {

        listaUsers.add(new User(nombre, password));
        Respuesta res = new Respuesta(200, new User(nombre, password).toString());

    }

    // update user

    public void modifyUser(String nombre, User usuario) {

        int oldUser = 0;

        for (User user : listaUsers) {

            if (Objects.equals(user.getNombre(), nombre)) {

                listaUsers.remove(oldUser);

                listaUsers.add(oldUser, usuario);

            }

        }

    }

    // get User

    public User getUser(String nombre) {

        User foundUser = null;

        for (User user : listaUsers) {

            if (Objects.equals(user.getNombre(), nombre)) {

                foundUser = user;

            }

        }

        return foundUser;

    }


    // delete User

    public void deleteUser(String nombre) {

        listaUsers.removeIf(user -> Objects.equals(user.getNombre(), nombre));

    }

}
