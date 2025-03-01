package com.ejemplo.animales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    public void testMakeSound() {
        Cat cat1 = new Cat("Mr. Mittens");
        assertEquals("Meow", cat1.makesound());
    }

    @Test
    public void testGetName() {
        Cat cat1 = new Cat("Mr. Mittens");
        assertEquals("Mr. Mittens", cat1.getName());
    }
}
