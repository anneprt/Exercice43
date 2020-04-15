package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valeur;
        int plusGrande;
        int plusPetite;
        int somme = 0;
        int nombre = 0;
        double moyenne;

        System.out.println("Entrez  une valeur au clavier");
        Scanner lectureClavier = new Scanner(System.in);
        valeur = lectureClavier.nextInt();
        plusGrande = valeur;
        plusPetite = valeur;

        do {
            if (plusGrande < valeur) {
                plusGrande = valeur;
            }
            if (plusPetite > valeur) {
                plusPetite = valeur;
            }
            somme = somme + valeur;
            nombre = nombre + 1;
            System.out.print("Entrer une valeur (0 pour sortir) :");
            valeur = lectureClavier.nextInt();
        } while (valeur != 0);

        System.out.println("La plus grande valeur est:" + plusGrande);
        System.out.println("La plus petite valeur est: " + plusPetite);
        moyenne = (float) somme / nombre;
        System.out.println("La moyenne est : " + moyenne);
    }
}
