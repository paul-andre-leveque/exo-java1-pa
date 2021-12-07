package fr.Matrices;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestMatrice {
    int[][] _A = new int[][] {{4, 2}, {6, 3}};
    int[][] _B = new int[][] {{9, 7}, {4, 1}};
    int[][] _C = new int[][] {{2, 4}, {1, 3}, {8, 5}};
    int[][] _D = new int[][] {{5, 4, 8}, {7, 6, 4}};
    int[][] _E = new int[][] {{5}};
    int[][] _F = new int[][] {{7}};
    int[][] _G = new int[][] {{7, 2}};
    int[][] _H = new int[][] {{7}, {2}};

    int[][] _I = new int[][] {{3, 5}, {-1, 1}};
    int[][] _J = new int[][] {{-2, 2, 3}, {3, 5, -2}};

    int[][] _ResAddition = new int[][] {{13, 9}, {10, 4}};
    int[][] _ResAdditionUnUn = new int[][] {{12}};
    int[][] _ResTransposition = new int[][] {{2, 1, 8}, {4, 3, 5}};
    int[][] _ResMultiplicatioCD = new int[][] {{38, 32, 32}, {26, 22, 20}, {75, 62, 84}};
    int[][] _ResMultiplicatioDC = new int[][] {{78, 72}, {52, 66}};
    int[][] _ResMultiplicatioIJ = new int[][] {{9, 31, -1}, {5, 3, -5}};


    ArrayList<ArrayList<Integer>> A = Main.GenerateMatrice(_A);
    ArrayList<ArrayList<Integer>> B = Main.GenerateMatrice(_B);
    ArrayList<ArrayList<Integer>> C = Main.GenerateMatrice(_C);
    ArrayList<ArrayList<Integer>> D = Main.GenerateMatrice(_D);
    ArrayList<ArrayList<Integer>> E = Main.GenerateMatrice(_E);
    ArrayList<ArrayList<Integer>> F = Main.GenerateMatrice(_F);
    ArrayList<ArrayList<Integer>> G = Main.GenerateMatrice(_G);
    ArrayList<ArrayList<Integer>> H = Main.GenerateMatrice(_H);
    ArrayList<ArrayList<Integer>> I = Main.GenerateMatrice(_I);
    ArrayList<ArrayList<Integer>> J = Main.GenerateMatrice(_J);

    ArrayList<ArrayList<Integer>> ResAddition = Main.GenerateMatrice(_ResAddition);
    ArrayList<ArrayList<Integer>> ResAdditionUnUn = Main.GenerateMatrice(_ResAdditionUnUn);
    ArrayList<ArrayList<Integer>> ResTransposition = Main.GenerateMatrice(_ResTransposition);
    ArrayList<ArrayList<Integer>> ResMultiplicatioCD = Main.GenerateMatrice(_ResMultiplicatioCD);
    ArrayList<ArrayList<Integer>> ResMultiplicatioDC = Main.GenerateMatrice(_ResMultiplicatioDC);
    ArrayList<ArrayList<Integer>> ResMultiplicatioIJ = Main.GenerateMatrice(_ResMultiplicatioIJ);

    @Test
    public void testAddition() {
        assertEquals(ResAddition, Main.Addition(A, B));
    }

    @Test
    public void testAdditionAvecDesMatricesInegalesX() {
        assertNull(Main.Addition(A, D));
    }

    @Test
    public void testAdditionAvecDesMatricesInegalesY() {
        assertNull(Main.Addition(A, C));
    }

    @Test
    public void testAdditionAvecDesMatricesUnUn() {
        assertEquals(ResAdditionUnUn, Main.Addition(E, F));
    }



    @Test
    public void testTransposition() {
        assertEquals(ResTransposition, Main.Transposition(C));
    }

    @Test
    public void testTranspositionUn() {
        assertEquals(E, Main.Transposition(E));
    }

    @Test
    public void testTranspositionUnDeux() {
        assertEquals(H, Main.Transposition(G));
    }

    @Test
    public void testTranspositionDeuxUn() {
        assertEquals(G, Main.Transposition(H));
    }

    @Test
    public void testMultiplicationCD() {
        assertEquals(ResMultiplicatioCD, Main.Multiplication(C, D));
    }

    @Test
    public void testMultiplicationDC() {
        assertEquals(ResMultiplicatioDC, Main.Multiplication(D, C));
    }

    @Test
    public void testMultiplicationIJ() {
        assertEquals(ResMultiplicatioIJ, Main.Multiplication(I, J));
    }

    @Test
    public void testMultiplicationDB() {
        assertNull(Main.Multiplication(D, B));
    }
}
