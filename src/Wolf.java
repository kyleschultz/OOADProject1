public class Wolf extends Canine {

    public Wolf(){

    }

    @Override
    public String eat() {
        String name = getName();
        String result = name + " is eating kibble";
        return result;
    }


    @Override
    public String makeNoise() {
        String noise = "Howl";
        return noise;
    }
}