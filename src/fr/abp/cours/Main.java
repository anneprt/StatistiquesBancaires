package fr.abp.cours;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Nombre de paiements par Carte Bleue");
        nbCb = lectureClavier.nextInt();
        System.out.print("Nombre de chèques émis");
        nbCheque = lectureClavier.nextInt();
        System.out.print("Nombre de virements automatiques effectués");
        nbVirements = lectureClavier.nextInt();


    }
}
