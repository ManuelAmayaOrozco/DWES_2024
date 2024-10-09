package Tema2.ejerIsAdminManuelAmayaOrozco.Repository;

import Tema2.ejerIsAdminManuelAmayaOrozco.Model.UserAd;

import java.util.ArrayList;

public class UserAdRepository implements UserAdRepositoryAPI{

    //Base de datos ficticia
    ArrayList<UserAd> bddUserAd;

    public UserAdRepository() {
        this.bddUserAd = new ArrayList<UserAd>();
        bddUserAd.add(new UserAd("1D", "diego@diego.es", "0bce9ed17b74edb9a41ee60f2bdc111f0b76a28b02561b2e3b3ad15bc9b1805d", true)); //pass: sSHEcjlt
        bddUserAd.add(new UserAd("2M", "marta@diego.es", "619b4ad13104bb2a80742ae65d8a9e4af2240652430d3eda9ae39e22a037e8cc", false)); //pass: 2FGoRkS2
        bddUserAd.add(new UserAd("3J", "juan@diego.es", "6cebe4ef0bc991e87ee6ecc7aed7e7fbc5f61601a8708b7d30a73e9d4eafc69b", false)); //pass: nrd32sC7
        bddUserAd.add(new UserAd("4B", "billy@diego.es", "8ea8d3a151a989fbce578fc80c02993075d0ad925660427c8462ef12aea29dc8", false)); //pass: 6DHMvsON
        bddUserAd.add(new UserAd("5J", "joe@diego.es", "47092541925345fd6422a41ae9ebb9ea844e0f9047a0bf728d51cb40769f4fb9", true)); // pass: L456xwbd
    }

    @Override
    public UserAd getUserAdEmail(String email) {

        //return bddUserEmail.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
        UserAd userReturn = null;

        for (UserAd u : bddUserAd) {

            if (u.getEmail().equals(email)) {

                userReturn = u;
                break;

            }

        }

        return userReturn;
    }

    @Override
    public UserAd insertUserAdEmail(UserAd u) {

        bddUserAd.add(u);

        // return bddUserEmail.stream().filter(u -> u.getEmail().equals(u.getEmail())).findFirst().orElse(null);
        return getUserAdEmail(u.getEmail());

    }

    @Override
    public UserAd updateUserAdEmail(UserAd u, UserAd uAct) {

        for (int i = 0; i < bddUserAd.size(); i++) {

            if (bddUserAd.get(i).getEmail().equals(u.getEmail())) {

                bddUserAd.set(i, uAct);
                break;

            }

        }

        return getUserAdEmail(uAct.getEmail());

    }

    @Override
    public boolean deleteUserAdEmail(String email) {

        //return bddUserEmail.removeIf(u -> u.getEmail().equals(email));
        return bddUserAd.remove(getUserAdEmail(email));

    }
}
