package fr.Fourmis;

public class Fourmis {
    private int age;
    private int force;

    // Constructeur prenant en paramètres tous les attributs de classe
    public Fourmis(int age, int force) {
        this.age = age;
        this.force = force;
    }

    // Méthode permettant à chaque fourmi de communiquer avec une fourmi passée en paramètre
    public void communication(Fourmis otherFourmi) {
        System.out.println("Bonjour, je suis une fourmi et je communique avec une autre fourmi.");
    }

    // Méthode déplacement retournant la vitesse d'une fourmi en fonction de l'environnement
    public double deplacement(String environnement) {
        throw new UnsupportedOperationException("La méthode 'deplacement' doit être implémentée dans une sous-classe de 'Fourmis' car elle dépend de la spécialisation de la fourmi.");
    }

    // Implémentation de la méthode toString
    @Override
    public String toString() {
        return "Fourmis [Âge = " + age + ", Force = " + force + "]";
    }

    // Getter pour l'âge de la fourmi
    public int getAge() {
        return age;
    }

    // Getter pour la force de la fourmi
    public int getForce() {
        return force;
    }
}

