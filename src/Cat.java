import java.util.Random;

public class Cat extends Feline{

    private Random rand;

    public Cat(){
        rand = new Random();
    }

    public Cat(String name){
        super(name);
        rand = new Random();
    }

    public String catDoSomething(){
        String name = getName();
        String result = "";
        int randInt = rand.nextInt(3);
        switch(randInt){
            case 0:
                result = name + " is eating fancy feast";
                break;
            case 1:
                result = name + " says prrrr";
                break;
            case 2:
                name = getName();
                result = name + " is roaming";
                break;
            default:
                result = "";
                break;
        }
        return result;
    }

    @Override
    public String eat() {
        return catDoSomething();
    }

    @Override
    public String makeNoise(){
        return catDoSomething();
    }

    @Override
    public String roam(){
        return catDoSomething();
    }
}