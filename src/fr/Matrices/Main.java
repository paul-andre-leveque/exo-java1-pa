package fr.Matrices;

import java.util.ArrayList;

public class Main {
    public static ArrayList<ArrayList<Integer>> GenerateMatrice(int[][] A) {
        ArrayList<ArrayList<Integer>> R = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            R.add(new ArrayList<>());
            for (int j = 0; j < A[i].length; j++) {
                R.get(i).add(A[i][j]);
            }
        }

        return R;
    }

    public static ArrayList<ArrayList<Integer>> Addition(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        // Retourne l'addition de la matrice A et B
        // Les matrices sont forcément valides (Pas de {{1, 2}, {3, 4, 5}})
        // Mais attention, les matrices peuvent être de tailles différentes, dans ce cas, retourner null
        // La fonction doit marcher sur toutes les tailles de matrice, dès 1x1

        return null;
    }

    public static ArrayList<ArrayList<Integer>> Transposition(ArrayList<ArrayList<Integer>> A) {
        // Retourne la transposé de la matrice A
        // Les matrices sont forcément valides (Pas de {{1, 2}, {3, 4, 5}})
        // La fonction doit marcher sur toutes les tailles de matrice, dès 1x1

        return null;
    }
}
