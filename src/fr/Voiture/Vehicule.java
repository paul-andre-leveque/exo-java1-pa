package fr.Voiture;

public abstract class Vehicule {
    protected int nb_roues;

    public Vehicule(int nb_roues) {
        this.nb_roues = nb_roues;
    }

    public void klaxon() {
        System.out.println("Poin Poin");
    }

    public abstract void deplacer();
}
