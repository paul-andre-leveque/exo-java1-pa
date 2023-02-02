package fr.TP1;

import java.util.ArrayList;

public class Main {
    public static int AfficherTableau(ArrayList<Integer> tab) {
        // Afficher un tableau dans le terminal
        for (int i: tab){
            System.out.println(i);
        }
        return 0;
    }

    public static ArrayList<Integer> AjouterValeur(ArrayList<Integer> tab) {
        // Ajouter une case au tableau ayant pour valeur 2
        tab.add(2);

        return tab;
    }

    public static ArrayList<Integer> AjouterUn(ArrayList<Integer> tab) {
        // Ajouter 1 à toutes les valeurs du tableau
        ArrayList <Integer> res = new ArrayList();
        for (int i: tab){
            i++;
            res.add(i);
        }

        return res;
    }

    public static int MonLen(ArrayList<Integer> tab) {
        // Retourner la longueur du tableau
        for(int i :tab ){
            System.out.println(tab.size());
        }
        return tab.size();
    }

    public static int Search(ArrayList<Integer> tab, int valeur){
        // Retourner la position de la première instance de "valeur"
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) == valeur) {
                return i;
            }
        }
        return 0;
    }

    public static int MonMax(ArrayList<Integer> tab) {
        // Retourner la valeur maximale du tableau
        int max = tab.get(0);
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) > max) {
                max = tab.get(i);
            }
        }
        return max;
    }

    public static int MonMin(ArrayList<Integer> tab) {
        // Retourner la valeur minimale du tableau
        int min = tab.get(0);
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) < min) {
                min = tab.get(i);
            }
        }
        return min;
    }

    public static ArrayList<Integer> Inverse(ArrayList<Integer> tab) {
        // Retourner le tableau à l'envers
        ArrayList <Integer> res = new ArrayList();
        for (int i = tab.size()-1; i >= 0; i--) {
            res.add(tab.get(i));
        }
        return res;
    }

    public static ArrayList<Integer> MonRemove(ArrayList<Integer> tab, int valeur) {
        // Retourner le tableau sans la première instance de "valeur.
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) == valeur) {
                tab.remove(i);
                break;
            }
        }
        return tab;
    }

    public static ArrayList<Integer> MonInsert(ArrayList<Integer> tab, int valeur, int position) {
        // Retourner le tableau avec l'ajout de "valeur" à "position.
        for (int i = 0; i < tab.size(); i++) {
            if (i == position) {
                tab.add(i, valeur);
                break;
            }
        }
        return tab;
    }

    public static ArrayList<Integer> trie(ArrayList<Integer> tab) {
        // Retourner le tableau trié
        ArrayList <Integer> res = new ArrayList();
        while (tab.size() > 0) {
            int min = MonMin(tab);
            res.add(min);
            tab = MonRemove(tab, min);
        }
        return res;
    }

    public static ArrayList<Integer> nonPair(ArrayList<Integer> tab) {
        // Retourner le tableau sans les nombres pairs
        // Il faut utiliser un itérateur, et la boucle for => il ne faut pas créer un autre tableau
        for (int i = 0; i < tab.size(); i++) {
            int j = tab.get(i);
            if (j % 2 == 0) {
                tab = MonRemove(tab, j);
                --i;
            }
        }
        return tab;
    }
}
