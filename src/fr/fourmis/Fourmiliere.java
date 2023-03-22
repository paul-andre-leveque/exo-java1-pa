package fr.fourmis;

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
        Random rand = new Random();
        nbOeufs += rand.nextInt(6);

        stockNourriture -= fourmis.size();

        List<Fourmis> newFourmis = new ArrayList<>();
        for (Fourmis f : fourmis) {
            if (f instanceof Chasseresse) {
                ((Chasseresse) f).chasser(this);
            } else if (f instanceof Nourrice) {
                Fourmis newFourmi = ((Nourrice) f).nurse(this);
                if (newFourmi != null) {
                    newFourmis.add(newFourmi);
                }
            } else if (f instanceof Ouvriere) {
                ((Ouvriere) f).agrandissement(this);
            }
        }
        fourmis.addAll(newFourmis);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre d'oeufs: ").append(nbOeufs).append("\n");
        sb.append("Stock de nourriture: ").append(stockNourriture).append("\n");
        sb.append("Nombre de salles: ").append(nbSalles).append("\n");
        sb.append("Fourmis presentes:\n");

        for (Fourmis f : fourmis) {
            sb.append("  - ").append(f.toString()).append("\n");
        }

        return sb.toString();
    }
}


