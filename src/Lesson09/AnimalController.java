package Lesson09;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public void main(String[] args) {

        Animal horse = new Animal.AnimalBuilder().withName("Horse").withFlyable(false).withSpeed(99).build();
        Animal dog = new Animal.AnimalBuilder().withName("Dog").withFlyable(false).withSpeed(80).build();
        Animal tiger = new Animal.AnimalBuilder().withName("Tiger").withFlyable(false).withSpeed(70).build();
        Animal facon = new Animal.AnimalBuilder().withName("Falcon").withFlyable(true).withSpeed(50).build();
        Animal snake = new Animal.AnimalBuilder().withName("Snake").withFlyable(false).withSpeed(40).build();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(horse);
        animals.add(dog);
        animals.add(tiger);
        animals.add(facon);
        animals.add(snake);

        ArrayList<Animal> racingAnimal = new ArrayList<>();
        for (Animal a : animals) {
            if (!a.isFlyable()){
                racingAnimal.add(a);
            }
        }

        int maxSpeed = racingAnimal.get(0).getSpeed();
        String maxSpeedName = racingAnimal.get(0).getName();

        for (int i = 1; i <= racingAnimal.size() - 1; i++) {
            if (racingAnimal.get(i).getSpeed() > maxSpeed) {
                maxSpeed = racingAnimal.get(i).getSpeed();
                maxSpeedName = racingAnimal.get(i).getName();
            }
        }
        System.out.printf("Winner is %s, with speed: %d", maxSpeedName, maxSpeed);


    }
}