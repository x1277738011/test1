package Work;

public class Simulator {
    void playSound(Animal animal){
        System.out.println(animal.getAnimalName()+":");
        animal.cry();
    }
}
