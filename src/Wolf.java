public class Wolf extends Canine {

    /*
     *  Defualt constructor
     */
    public Wolf(){

    }

    /*
     * Secondary constructor thats calls the superclass secondary constructor
     * @param name Name of Wolf
     */
    public Wolf(String name){
        super(name);
    }

    /*
     * Overridden method eat
     * @return String of Wolf eating
     */
    @Override
    public String eat() {
        String name = getName();
        String result = name + " of " + getClass() + " is eating kibble";
        return result;
    }


    /*
     * Overridden method makeNoise
     * @return String of Wolf making noise
     */
    @Override
    public String makeNoise() {
        String name = getName();
        String noise = name + " of " + getClass() + " is howling";
        return noise;
    }
}
