package fr.Voleur;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestVoleur {
    @Test
    public void test1() {
        assertEquals(10, Main.Argent(1, 10));
    }

    @Test
    public void test5() {
        assertEquals(45, Main.Argent(5, 15));
    }

    @Test
    public void test10() {
        assertEquals(500, Main.Argent(10, 100));
    }
}
