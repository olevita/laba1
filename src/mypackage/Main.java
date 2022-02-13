package mypackage;

import entities.Administrator;
import entities.Engineer;

public class Main {

    public static void main(String[] args) {
        Administrator admin = new Administrator("Alex");
        Engineer volodia = new Engineer("Volodia");

        System.out.println(admin.getName() + ':');
        admin.work();

        System.out.println();
        System.out.println();

        System.out.println(volodia.getName() + ':');
        volodia.work();
    }
}
