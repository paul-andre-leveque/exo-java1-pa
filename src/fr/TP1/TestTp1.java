package fr.TP1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestTp1 {

    private ArrayList<Integer> tableau = new ArrayList<>(Arrays.asList(1, 5, 8, -9, 2, 4, 12));


    @Test
    public void testAjouterUn() {
        ArrayList<Integer> tableauPlusUn = new ArrayList<>(Arrays.asList(2, 6, 9, -8, 3, 5, 13));
        assertEquals(tableauPlusUn, Main.AjouterUn(tableau));
    }

    @Test
    public void testLen() {
        assertEquals(7, Main.MonLen(tableau));
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
    public void testSort() {
        ArrayList<Integer> tableauTrie = new ArrayList<>(Arrays.asList(-9, 1, 2, 4, 5, 8, 12));
        assertEquals(tableauTrie, Main.trie(tableau));
    }
}
