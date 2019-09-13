public class Feline extends Animal {

    public Feline(){

    }

    public Feline(String name){
        super(name);
    }

    public String eat() {
        String name = getName();
        String result = name + " is eating Feline food";
        return result;
    }

    @Override
    public String makeNoise(){
        String noise = "Meow";
        return noise;
    }


}