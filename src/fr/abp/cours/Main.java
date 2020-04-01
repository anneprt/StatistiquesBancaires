package fr.abp.cours;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nbCb = 0;
        int nbCheque = 0;
        int nbVirement = 0;
        int nbDebit = 0;
        float pourcentageCb;
        float pourcentageCheque;
        float pourcentageVirement;


        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Nombre de paiements par Carte Bleue");
        nbCb = lectureClavier.nextInt();
        System.out.println("Nombre de chèques émis");
        nbCheque = lectureClavier.nextInt();
        System.out.println("Nombre de virements automatiques effectués");
        nbVirement = lectureClavier.nextInt();

        nbDebit = nbCb + nbCheque + nbVirement;

        pourcentageCb = (float) nbCb / nbDebit * 100;
        pourcentageCheque = (float) nbCheque / nbDebit * 100;
        pourcentageVirement = (float) nbVirement / nbDebit * 100;

        System.out.println("Vous avez émis " + nbDebit + " ordres de débit");
        System.out.println("dont " + pourcentageCb + " % par Carte Bleue");
        System.out.println("" + pourcentageCheque + " % par chèque");
        System.out.println("" + pourcentageVirement + " % par virement");


    }
}

