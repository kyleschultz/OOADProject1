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
        String result = "";
        int randInt = rand.nextInt(4);
        switch(randInt){
            case 0:
                result = eat();
                break;
            case 1:
                result = makeNoise();
                break;
            case 2:
                if(getAsleep() == true){
                    result = setAsleep(false);
                    break;
                }
                else{
                    result = setAsleep(true);
                    break;
                }

            case 3:
                result = roam();
                break;
            default:
                result = "";
                break;
        }
        return result;
    }

    public String eat() {
        String name = getName();
        String result = name + " is eating fancy feast";
        return result;
    }

    public String makeNoise(){
        String noise = "Prrrr";
        return noise;
    }
}