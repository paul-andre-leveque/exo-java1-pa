package fr.Fichiers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFichiers {

    @Test
    public void testStatistiqueMot() {
        assertEquals('e', Main.statistiqueMot());
    }
}
