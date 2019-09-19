import java.util.List;
import java.util.LinkedList;

public class Zookeeper {
    private List<Animal> animals;

    /*
     *  Default constructor, creates new LinkedList of type Animal
     */
    public Zookeeper(){
        animals = new LinkedList<Animal>();
    }

    /*
     *  Adds an Animal to the LinkedList
     *  @param a Animal to add to list
     */
    public void addAnimal(Animal a) {
        animals.add(a);
    }

    /*
     *  Calls setAsleep() with false for all Animals
     */
    public void wake() {
        for (Animal a: animals){
            System.out.println(a.setAsleep(false));
        }
    }

    /*
     *  Calls makeNoise() for all Animals
     */
    public void rollCall() {
        for(Animal a: animals){
            System.out.println(a.makeNoise());
        }
    }

    /*
     *  Calls eat() for all Animals
     */
    public void feed(){
        for(Animal a: animals){
            System.out.println(a.eat());
        }
    }

    /*
     *  Calls roam() for all Animals
     */
    public void letRoam(){
        for(Animal a: animals){
            System.out.println(a.roam());
        }
    }

    /*
     *  Calls setAsleep() with true for all Animals
     */
    public void closeZoo(){
        for(Animal a: animals){
            System.out.println(a.setAsleep(true));
        }
    }
}