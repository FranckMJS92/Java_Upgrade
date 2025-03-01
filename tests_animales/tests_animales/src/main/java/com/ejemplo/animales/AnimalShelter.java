package com.ejemplo.animales;

import java.util.List;
import java.util.ArrayList;

public class AnimalShelter {

    private List<Animal> animals;

    public AnimalShelter() {
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

}
