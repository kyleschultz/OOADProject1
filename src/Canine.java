public class Canine extends Animal {

    public Canine(){

    }

    public Canine(String name){
        super(name);
    }

    public String eat() {
        String name = getName();
        String result = name + " of " + getClass() + "" + " is eating Meat";
        return result;
    }

    @Override
    public String makeNoise(){
        String name = getName();
        String noise = name + " of " + getClass() + "" + " is barking";
        return noise;
    }


}