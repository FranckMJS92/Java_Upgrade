package com.ejemplo.animales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {
    @Test
    public void testMakeSound(){
        Dog dog1 = new Dog("Daysi");
        assertEquals("Woof", dog1.makesound());
    }

    @Test
    public void testGetName(){
        Dog dog1 = new Dog("Daysi");
        assertEquals("Daysi", dog1.getName());
    }

}
