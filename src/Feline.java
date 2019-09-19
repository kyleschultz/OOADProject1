public class Feline extends Animal {

    /*
     *  Defualt constructor
     */
    public Feline(){

    }

    /*
     * Secondary constructor thats calls the superclass secondary constructor
     * @param name Name of Feline
     */
    public Feline(String name){
        super(name);
    }

    /*
     * Overridden method eat
     * @return String of Feline eating
     */
    @Override
    public String eat() {
        String name = getName();
        String result = name + " of " + getClass() + " is eating Feline food";
        return result;
    }

    /*
     * Overridden method makeNoise
     * @return String of Feline making noise
     */
    @Override
    public String makeNoise(){
        String name = getName();
        String noise = name + " of " + getClass() + " is meowing";
        return noise;
    }


}