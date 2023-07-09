package Abstraction.Abstract;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      // Animal animal = new Animal("tiger" , "big" ,300); //cannot create instance of abstract class

        Dog dog = new Dog("tiger" , "big" ,300);
        dog.makeNoise();
        doAnimalStuff(dog);

        System.out.println("-------------");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German shepard" , "big" ,100));
        animals.add(new Fish("GoldFish" , "small" ,10));
        animals.add(new Fish("Shark" , "big" ,300));
        animals.add(new Dog("Pug" , "small" ,20));

        animals.add(new Horse("Clydesdale" , "large", 1000));

        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof  mammal){

            }
        }

    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("hunt");
    }
}
