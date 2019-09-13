import java.util.List;
import java.util.LinkedList;

public class Zookeeper {
    private List<Animal> animals;

    public Zookeeper(){
        animals = new LinkedList<Animal>();
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
}