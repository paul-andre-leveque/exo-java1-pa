package fr.fourmis;

public class Ouvriere extends Fourmis {
    public Ouvriere(int age, int force) {
        super(age, force);
    }

    @Override
    public double deplacement(String environnement) {
        if ("sable".equalsIgnoreCase(environnement)) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    public String toString() {
        return "Ouvriere - " + super.toString();
    }

    public void agrandissement(Fourmiliere fourmiliere) {
        double chance = 0.1 / (double) this.getAge() * 100;
        double random = Math.random() * 100;

        if (random <= chance) {
            int nbSalles = fourmiliere.getNbSalles();
            fourmiliere.setNbSalles(nbSalles + 1);
        }
    }
}
