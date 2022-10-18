package fr.Voiture;

public final class Voiture extends Vehicule implements Moteur {
    private int _puissance;
    private int _vitesse;
    private String _marque;
    private TypeVoiture type;


    public Voiture(String marque, int puissance) {
        super(4);
        this._marque = marque;
        this._puissance = puissance;
        this._vitesse = 0;
        this.type = TypeVoiture.HYBRIDE;
    }

    public Voiture(String marque) {
        super(4);
        this._marque = marque;
        this._puissance = 20;
        this._vitesse = 0;
    }

    public void accelerer() {
        this._vitesse += this._puissance;
    }

    public void accelerer(int vitesseVoulu) {
        this._vitesse = vitesseVoulu;
    }

    public void klaxon() {
        System.out.println("Tut Tut");
    }

    @Override
    public void deplacer() {
        System.out.println("déplacement");
    }

    public int getPuissance() {
        return this._puissance;
    }

    public int get_vitesse() {
        return _vitesse;
    }

    public void set_vitesse(int _vitesse) {
        if (_vitesse > 130) {
            this._vitesse = 130;
        } else {
            this._vitesse = _vitesse;
        }
    }

    @Override
    public String toString() {
        return _marque + " avec une puissance de " + _puissance;
    }

    @Override
    public void demarrer() {
        System.out.println("Vroom");
    }
}

