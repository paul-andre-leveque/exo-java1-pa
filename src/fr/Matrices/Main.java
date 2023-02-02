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
        if (A.size() != B.size() || A.get(0).size() != B.get(0).size()) {
            return null;
        }
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            C.add(new ArrayList<>());
            for (int j = 0; j < A.get(i).size(); j++) {
                C.get(i).add(A.get(i).get(j) + B.get(i).get(j));
            }
        }
        return C;
    }

    public static ArrayList<ArrayList<Integer>> Transposition(ArrayList<ArrayList<Integer>> A) {
        // Retourne la transposé de la matrice A
        // Les matrices sont forcément valides (Pas de {{1, 2}, {3, 4, 5}})
        // La fonction doit marcher sur toutes les tailles de matrice, dès 1x1
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        for (int i = 0; i < A.get(0).size(); i++) {
            C.add(new ArrayList<>());
            for (int j = 0; j < A.size(); j++) {
                C.get(i).add(A.get(j).get(i));
            }
        }
        return C;
    }

    public static ArrayList<ArrayList<Integer>> Multiplication(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        // Retourne la multiplication des matrices A et B
        // Les matrices sont forcément valides (Pas de {{1, 2}, {3, 4, 5}})
        // Mais la multiplication peut être impossible (Comme : {{1, 2}, {3, 4}} x {{5, 6}, {7, 8}, {9, 10}})
        // La fonction doit marcher sur toutes les tailles de matrice, dès 1x1
        if (A.get(0).size() != B.size()) {
            return null;
        }
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            C.add(new ArrayList<>());
            for ( int j = 0; j < B.get(0).size(); j++){
                C.get(i).add(0);
                for (int k = 0; k < A.get(0).size(); k++) {
                    C.get(i).set(j,C.get(i).get(j) + A.get(i).get(k) * B.get(k).get(j));
                }
            }

        }

        return C;
    }
}
