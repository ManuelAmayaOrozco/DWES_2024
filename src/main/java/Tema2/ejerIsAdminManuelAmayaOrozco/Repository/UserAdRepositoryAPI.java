package Tema2.ejerIsAdminManuelAmayaOrozco.Repository;

import Tema2.ejerIsAdminManuelAmayaOrozco.Model.UserAd;

public interface UserAdRepositoryAPI {

    UserAd getUserAdEmail(String email);

    UserAd insertUserAdEmail(UserAd u);

    UserAd updateUserAdEmail(UserAd u, UserAd uAct);

    boolean deleteUserAdEmail(String email);

}
