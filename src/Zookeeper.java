import java.util.List;
import java.util.LinkedList;

public class Zookeeper {
    private List<Animal> animals;

    public Zookeeper(){
        animals = new LinkedList<Animal>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void wake() {
        for (Animal a: animals){
            System.out.println(a.setAsleep(false));
        }
    }

    public void rollCall() {
        for(Animal a: animals){
            System.out.println(a.makeNoise());
        }
    }

    public void feed(){
        for(Animal a: animals){
            System.out.println(a.eat());
        }
    }

    public void letRoam(){
        for(Animal a: animals){
            System.out.println(a.roam());
        }
    }

    public void closeZoo(){
        for(Animal a: animals){
            System.out.println(a.setAsleep(true));
        }
    }
}