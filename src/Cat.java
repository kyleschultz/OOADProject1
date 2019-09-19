import java.util.Random;

public class Cat extends Feline{

    private Random rand;

    /*
     * Default constructor. Creates new Random
     */
    public Cat(){
        rand = new Random();
    }

    /*
     * Secondary constructor thats calls the superclass secondary constructor. Creates new Random
     * @param name Name of Cat
     */
    public Cat(String name){
        super(name);
        rand = new Random();
    }

    /*
     * Randomly chooses an action for Cat to take
     * @return String of Cat's action
     */
    public String catDoSomething(){
        String name = getName();
        String result = "";
        int randInt = rand.nextInt(3);
        switch(randInt){
            case 0:
                result = name + " of " + getClass() + " is eating fancy feast";
                break;
            case 1:
                result = name + " of " + getClass() + " is purring";
                break;
            case 2:
                name = getName();
                result = name + " of " + getClass() + " is roaming";
                break;
            default:
                result = "";
                break;
        }
        return result;
    }

    /*
     * Overridden method eat. Calls catDoSomething
     * @return result of catDoSomething
     */
    @Override
    public String eat() {
        return catDoSomething();
    }

    /*
     * Overridden method makeNoise. Calls catDoSomething
     * @return result of catDoSomething
     */
    @Override
    public String makeNoise(){
        return catDoSomething();
    }

    /*
     * Overridden method roam. Calls catDoSomething
     * @return result of catDoSomething
     */
    @Override
    public String roam(){
        return catDoSomething();
    }
}