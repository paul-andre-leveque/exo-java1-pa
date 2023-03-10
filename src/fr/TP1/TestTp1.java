package fr.TP1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestTp1 {

    private ArrayList<Integer> tableau = new ArrayList<>(Arrays.asList(-1, 5, 8, -9, 2, 4, 12, 8));


    @Test
    public void testAfficherTableau() {
        assertEquals(0, Main.AfficherTableau(tableau));
    }

    @Test
    public void testAjouterValeur() {
        ArrayList<Integer> tableauFinal = new ArrayList<>(Arrays.asList(-1, 5, 8, -9, 2, 4, 12, 8, 2));
        assertEquals(tableauFinal, Main.AjouterValeur(tableau));
    }

    @Test
    public void testAjouterUn() {
        ArrayList<Integer> tableauPlusUn = new ArrayList<>(Arrays.asList(0, 6, 9, -8, 3, 5, 13, 9));
        assertEquals(tableauPlusUn, Main.AjouterUn(tableau));
    }

    @Test
    public void testLen() {
        assertEquals(tableau.size(), Main.MonLen(tableau));
    }

    @Test
    public void testSearch() {
        assertEquals(2, Main.Search(tableau, 8));
    }

    @Test
    public void testMax() {
        assertEquals(12, Main.MonMax(tableau));
    }

    @Test
    public void testMin() {
        assertEquals(-9, Main.MonMin(tableau));
    }

    @Test
    public void testInverse() {
        ArrayList<Integer> tableauInverse = new ArrayList<>(Arrays.asList(8, 12, 4, 2, -9, 8, 5, -1));
        assertEquals(tableauInverse, Main.Inverse(tableau));
    }

    @Test
    public void testInsert() {
        ArrayList<Integer> tableauInsert = new ArrayList<>(Arrays.asList(-1, 5, 7, 8, -9, 2, 4, 12, 8));
        assertEquals(tableauInsert, Main.MonInsert(tableau, 7, 2));
    }

    @Test
    public void testRemove() {
        ArrayList<Integer> tableauRemove = new ArrayList<>(Arrays.asList(-1, 5, -9, 2, 4, 12, 8));
        assertEquals(tableauRemove, Main.MonRemove(tableau, 8));
    }

    @Test
    public void testSort() {
        ArrayList<Integer> tableauTrie = new ArrayList<>(Arrays.asList(-9, -1, 2, 4, 5, 8, 8, 12));
        assertEquals(tableauTrie, Main.trie(tableau));
    }

    @Test
    public void testPair() {
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(-1, 5, -9));
        assertEquals(res, Main.nonPair(tableau));
    }
}
