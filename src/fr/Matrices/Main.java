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
        return null;
    }
}
