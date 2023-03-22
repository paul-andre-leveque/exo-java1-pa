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

        // Utiliser les méthodes spécifiques de chaque type de fourmi
        nourrice.nurse(fourmiliere);
        chasseresse.chasser(fourmiliere);
        ouvriere.agrandissement(fourmiliere);

        // Afficher les informations sur la fourmilière après les actions des fourmis
        System.out.println("Nombre d'œufs : " + fourmiliere.getNbOeufs());
        System.out.println("Stock de nourriture : " + fourmiliere.getStockNourriture());
        System.out.println("Nombre de salles : " + fourmiliere.getNbSalles());
    }
}

