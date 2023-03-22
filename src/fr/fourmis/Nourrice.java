package fr.fourmis;

import java.util.Random;

public class Nourrice extends Fourmis {
    public Nourrice(int age, int force) {
        super(age, force);
    }

    // Implémentation de la méthode deplacement pour la classe Nourrice
    @Override
    public double deplacement(String environnement) {
        if (environnement.equals("herbe")) {
            return 0.5;
        } else if (environnement.equals("sable") || environnement.equals("roche")) {
            return 1.0;
        } else {
            throw new IllegalArgumentException("L'environnement doit être 'herbe', 'sable' ou 'roche'");
        }
    }

    // Implémentation de la méthode toString pour la classe Nourrice
    @Override
    public String toString() {
        return "Nourrice [" + super.toString() + "]";
    }

    // Méthode nurse pour transformer un œuf en fourmi
    public void nurse(Fourmiliere fourmiliere) {
        if (fourmiliere.getNbOeufs() > 0) {
            fourmiliere.setNbOeufs(fourmiliere.getNbOeufs() - 1);
            Random rand = new Random();
            int randomFourmiType = rand.nextInt(3);
            Fourmis newFourmi;

            switch (randomFourmiType) {
                case 0:
                    newFourmi = new Nourrice(0, 10); // Ajouter les paramètres appropriés pour la classe Nourrice
                    break;
                case 1:
                    newFourmi = new Chasseresse(0, 10); // Ajouter les paramètres appropriés pour la classe Chasseresse
                    break;
                case 2:
                    newFourmi = new Ouvriere(0, 10); // Ajouter les paramètres appropriés pour la classe Ouvriere
                    break;
                default:
                    throw new IllegalStateException("Erreur dans la génération aléatoire de type de fourmi");
            }

            fourmiliere.ajouterFourmi(newFourmi);
        }
    }
}
