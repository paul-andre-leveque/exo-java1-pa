package fr.TP1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class TestTp1 {

    private ArrayList<Integer> tableau = new ArrayList<>(Arrays.asList(1, 5, 8, -9, 2, 4, 12));


    @Test
    public void testAjouterUn() {
        ArrayList<Integer> tableauPlusUn = new ArrayList<>(Arrays.asList(2, 6, 9, -8, 3, 5, 13));
        assertEquals(Main.AjouterUn(tableau), tableauPlusUn);
    }

    @Test
    public void testLen() {
        assertEquals(Main.MonLen(tableau), 7);
    }

    @Test
    public void testMax() {
        assertEquals(Main.MonMax(tableau), 12);
    }

    @Test
    public void testMin() {
        assertEquals(Main.MonMin(tableau), -9);
    }
}
