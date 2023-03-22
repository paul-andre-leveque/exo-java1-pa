package fr.fourmis;

public class Main {
    public static void main(String[] args) {
        Fourmiliere fourmiliere = new Fourmiliere();

        // Création de quelques fourmis
        Nourrice nourrice1 = new Nourrice(3, 2);
        Chasseresse chasseresse1 = new Chasseresse(5, 4);
        Ouvriere ouvriere1 = new Ouvriere(2, 3);

        // Ajout des fourmis à la fourmilière
        fourmiliere.ajouterFourmi(nourrice1);
        fourmiliere.ajouterFourmi(chasseresse1);
        fourmiliere.ajouterFourmi(ouvriere1);

        // Affichage des informations initiales de la fourmilière
        System.out.println("Fourmilière avant l'action :");
        System.out.println(fourmiliere);

        // Appel de la méthode 'action' de la fourmilière
        fourmiliere.action();

        // Affichage des informations de la fourmilière après l'action
        System.out.println("Fourmilière après l'action :");
        System.out.println(fourmiliere);

        // Test de la méthode 'chasser' pour provoquer l'exception ExceptionNourriture
        System.out.println("Test de l'exception ExceptionNourriture :");
        fourmiliere.setStockNourriture(10 * fourmiliere.getNbSalles() - 1);
        chasseresse1.chasser(fourmiliere);
    }
}

