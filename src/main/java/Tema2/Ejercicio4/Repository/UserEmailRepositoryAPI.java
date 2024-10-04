package Tema2.Ejercicio4.Repository;

import Tema2.Ejercicio4.Model.UserEmail;


public interface UserEmailRepositoryAPI {

    //Voy a definir los metodos que despues implementaremos
    UserEmail getUserEmail(String email);

    UserEmail insertUserEmail(UserEmail u);

    boolean deleteUserEmail(String email);
}
