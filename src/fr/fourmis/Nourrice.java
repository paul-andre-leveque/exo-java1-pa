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
    public Fourmis nurse(Fourmiliere fourmiliere) {
        if (fourmiliere.getNbOeufs() > 0) {
            fourmiliere.setNbOeufs(fourmiliere.getNbOeufs() - 1);
            Random rand = new Random();
            int type = rand.nextInt(3);
            int age = rand.nextInt(6) + 1;
            int force = rand.nextInt(6) + 1;

            if (type == 0) {
                return new Chasseresse(age, force);
            } else if (type == 1) {
                return new Nourrice(age, force);
            } else {
                return new Ouvriere(age, force);
            }
        }
        return null;
    }
}

