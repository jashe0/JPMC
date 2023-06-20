import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Animal animal = new Animal("animal","big",100)

        Dog dog = new Dog("Wolf","Big",100);
        dog.makeNoise();

        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepherd","Big",150));
        animals.add(new Fish("Goldfish","Small",1));
        animals.add(new Fish("Barracuda","Big",75));
        animals.add(new Dog("Pug","Small",20));
        animals.add(new Horse("Clydesdale", "Large", 1000));

        for(Animal animal: animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }

    }
    
    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("Slow");
    }

}
