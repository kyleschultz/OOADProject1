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

    public void roam(){
        for(Animal a: animals){
            System.out.println(a.getName() + " is walking around");
        }
    }
}