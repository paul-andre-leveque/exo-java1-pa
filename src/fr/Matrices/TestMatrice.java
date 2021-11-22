package fr.Matrices;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestMatrice {
    int[][] _A = new int[][] {{4, 2}, {6, 3}};
    int[][] _B = new int[][] {{9, 7}, {4, 1}};

    int[][] _ResAddition = new int[][] {{13, 9}, {10, 4}};

    ArrayList<ArrayList<Integer>> A = Main.GenerateMatrice(_A);
    ArrayList<ArrayList<Integer>> B = Main.GenerateMatrice(_B);

    ArrayList<ArrayList<Integer>> ResAddition = Main.GenerateMatrice(_ResAddition);

    @Test
    public void testAdditionMatrice() {
        assertEquals(ResAddition, Main.Addition(A, B));
    }
}
