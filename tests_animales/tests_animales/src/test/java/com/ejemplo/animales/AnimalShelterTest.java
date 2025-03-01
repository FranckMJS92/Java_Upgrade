package com.ejemplo.animales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalShelterTest {

    @Test
    public void testAddAndGetAllSounds(){
        AnimalShelter shelter = new AnimalShelter();

        shelter.addAnimal(new Cat("Piscas"));
        shelter.addAnimal(new Dog("Firulais"));

        List<String> sounds = shelter.getAllSounds();
    }

}
