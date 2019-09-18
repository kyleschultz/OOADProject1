public class Feline extends Animal {

    public Feline(){

    }

    public Feline(String name){
        super(name);
    }

    @Override
    public String eat() {
        String name = getName();
        String result = name + " of " + getClass() + "" +  " is eating Feline food";
        return result;
    }

    @Override
    public String makeNoise(){
        String name = getName();
        String noise = name + " of " + getClass() + "" + " is meowing";
        return noise;
    }


}