public class Wolf extends Canine {

    public Wolf(){

    }

    public Wolf(String name){
        super(name);
    }

    @Override
    public String eat() {
        String name = getName();
        String result = name + " of " + getClass() + "" + " is eating kibble";
        return result;
    }


    @Override
    public String makeNoise() {
        String name = getName();
        String noise = name + " of " + getClass() + "" + " is howling";
        return noise;
    }
}
