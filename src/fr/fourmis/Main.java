package fr.fourmis;

public class Main {
    public static void main(String[] args) {
        // Créer une fourmilière
        Fourmiliere fourmiliere = new Fourmiliere();

        // Créer des fourmis de différents types
        Nourrice nourrice = new Nourrice(3, 5);
        Chasseresse chasseresse = new Chasseresse(4, 7);
        Ouvriere ouvriere = new Ouvriere(2, 6);

        // Ajouter les fourmis à la fourmilière
        fourmiliere.ajouterFourmi(nourrice);
        fourmiliere.ajouterFourmi(chasseresse);
        fourmiliere.ajouterFourmi(ouvriere);


        // Afficher les informations sur les fourmis
        System.out.println(nourrice);
        System.out.println(chasseresse);
        System.out.println(ouvriere);

        System.out.println(fourmiliere);


        // Utiliser les méthodes spécifiques de chaque type de fourmi
        nourrice.nurse(fourmiliere);
        chasseresse.chasser(fourmiliere);
        ouvriere.agrandissement(fourmiliere);

        // Affichage des informations de la fourmilière après l'action
        System.out.println("Fourmilière après l'action :");
        System.out.println(fourmiliere);


        // Afficher les informations sur la fourmilière après les actions des fourmis
        System.out.println("Nombre d'œufs : " + fourmiliere.getNbOeufs());
        System.out.println("Stock de nourriture : " + fourmiliere.getStockNourriture());
        System.out.println("Nombre de salles : " + fourmiliere.getNbSalles());

        /// Affichage des informations initiales de la fourmilière
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
        chasseresse.chasser(fourmiliere);
    }
}

