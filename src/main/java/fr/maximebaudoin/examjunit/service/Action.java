package fr.maximebaudoin.examjunit.service;

public class Action {

    public static String[] actions = {"pierre", "feuille", "ciseau"};

    public static String actionRandom() {

        int random = (int) (Math.random() * 2);
        return actions[random];
    }

    public static boolean win(Integer userAction, Integer computerAction) {
        if(userAction == 0 && computerAction == 2) {
            return true;
        }

        if(userAction == 1 && computerAction == 0) {
            return true;
        }

        if(userAction == 2 && computerAction == 1) {
            return true;
        }

        return false;
    }

}
