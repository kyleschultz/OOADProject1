public class Cat extends Feline{

    public Cat(){

    }

    @Override
    public String eat() {
        String name = getName();
        String result = name + " is eating fancy feast";
        return result;
    }

    @Override
    public String makeNoise(){
        String noise = "Prrrr";
        return noise;
    }
}