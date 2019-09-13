public class Canine extends Animal {

    public Canine(){

    }

    public Canine(String name){
        super(name);
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