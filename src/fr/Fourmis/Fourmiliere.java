package fr.Fourmis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fourmiliere {
    private int nbOeufs;
    private int stockNourriture;
    private int nbSalles;
    private List<Fourmis> fourmis;

    // Constructeur par défaut avec des valeurs aléatoires pour les attributs entiers
    public Fourmiliere() {
        Random rand = new Random();

        this.nbOeufs = rand.nextInt(11) + 10; // Entre 10 et 20
        this.stockNourriture = rand.nextInt(6) + 15; // Entre 15 et 20
        this.nbSalles = rand.nextInt(5) + 3; // Entre 3 et 7
        this.fourmis = new ArrayList<>();
    }
    // Méthode pour obtenir le nombre d'œufs
    public int getNbOeufs() {
        return nbOeufs;
    }

    // Méthode pour définir le nombre d'œufs
    public void setNbOeufs(int nbOeufs) {
        this.nbOeufs = nbOeufs;
    }

    // Méthode pour ajouter une fourmi à la fourmilière
    public void ajouterFourmi(Fourmis fourmi) {
        this.fourmis.add(fourmi);
    }

    // Méthode pour obtenir le stock de nourriture
    public int getStockNourriture() {
        return stockNourriture;
    }

    // Méthode pour définir le stock de nourriture
    public void setStockNourriture(int stockNourriture) {
        this.stockNourriture = stockNourriture;
    }

    public int getNbSalles() {
        return nbSalles;
    }

    // Setter pour le nombre de salles
    public void setNbSalles(int nbSalles) {
        this.nbSalles = nbSalles;
    }

    public void action() {
        Random random = new Random();

        // Augmenter le nombre d'œufs d'un nombre aléatoire entre 0 et 5
        nbOeufs += random.nextInt(6);

        // Retirer un point de nourriture par fourmi présente
        stockNourriture -= fourmis.size();
        if (stockNourriture < 0) {
            stockNourriture = 0;
        }

        // Activer chaque fourmi avec sa compétence spéciale
        for (Fourmis fourmi : fourmis) {
            if (fourmi instanceof Nourrice) {
                ((Nourrice) fourmi).nurse(this);
            } else if (fourmi instanceof Chasseresse) {
                ((Chasseresse) fourmi).chasser(this);
            } else if (fourmi instanceof Ouvriere) {
                ((Ouvriere) fourmi).agrandissement(this);
            }
        }
    }
}
