public class Canine extends Animal {

    public Canine(){

    }

    public String eat() {
        String name = getName();
        String result = name + " is eating Meat";
        return result;
    }

    @Override
    public String makeNoise(){
        String noise = "Bark";
        return noise;
    }


}