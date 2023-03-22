package fr.fourmis;
import java.util.concurrent.atomic.AtomicInteger;

public class Chasseresse extends Fourmis {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int numeroChasseresse;

    public Chasseresse(int age, int force) {
        super(age, force);
        this.numeroChasseresse = count.incrementAndGet();
    }
    public int getNumeroChasseresse() {
        return numeroChasseresse;
    }

    // Implémentation de la méthode deplacement pour la classe Chasseresse
    @Override
    public double deplacement(String environnement) {
        return this.getForce();
    }

    // Implémentation de la méthode toString pour la classe Chasseresse
    @Override
    public String toString() {
        return "Chasseresse " + super.toString() + ", Numero = " + numeroChasseresse + "]";
    }

    // Méthode chasser pour augmenter le stock de nourriture de la fourmilière
    public void chasser(Fourmiliere fourmiliere) {
        int newStockNourriture = fourmiliere.getStockNourriture() + getForce();
        try {
            if (newStockNourriture > 10 * fourmiliere.getNbSalles()) {
                throw new ExceptionNourriture("La chasseresse " + getNumeroChasseresse() + " a travaille pour rien !");
            } else {
                fourmiliere.setStockNourriture(newStockNourriture);
            }
        } catch (ExceptionNourriture e) {
            System.out.println(e.getMessage());
        }
    }

    // Getter pour la force de la Chasseresse
    public int getForce() {
        return super.getForce();
    }
}

