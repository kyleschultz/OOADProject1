public class Canine extends Animal {

    /*
     * Default constructor
     */
    public Canine(){

    }

    /*
     * Secondary constructor thats calls the superclass secondary constructor
     * @param name Name of Canine
     */
    public Canine(String name){
        super(name);
    }

    /*
     * Overridden method eat
     * @return String of Canine eating
     */
    public String eat() {
        String name = getName();
        String result = name + " of " + getClass() + " is eating Meat";
        return result;
    }

    /*
     * Overridden method makeNoise
     * @return String of Canine making noise
     */
    @Override
    public String makeNoise(){
        String name = getName();
        String noise = name + " of " + getClass() + " is barking";
        return noise;
    }


}