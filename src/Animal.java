public class Animal {
    private String name;
    private Boolean is_asleep;

    /*
     *  Default constructor, sets Animal as intially asleep
     */
    public Animal() {
        this.is_asleep = true;
    }

    /*
     *  Alternative contructor that sets Animal's name
     *  @param name Name of Animal
     */
    public Animal(String name){
        this.name = name;
        this.is_asleep = true;
    }

    /*
     * Gets name of Animal
     * @return Name of Animal
     */
    public String getName() {
        return this.name;
    }

    /*
     * Sets Animal's name
     * @param name New name of Animal
     */
    public void setName(String name){
        this.name = name;
    }

    /*
     * Gets sleeping status of Animal
     * @return Sleeping status of Animal
     */
    public Boolean getAsleep() {
        return is_asleep;
    }

    /*
     * Sets sleeping status of Animal
     * @param asleep True or False if animal is alseep
     * @return String of sleeping status of Animal
     */
    public String setAsleep(Boolean asleep) {
        this.is_asleep = asleep;
        if(!this.is_asleep) {
            return this.name+ " of " + getClass() + " is awake";
        }
        else{
            return this.name + " of " + getClass() + " is sleeping";
        }

    }

    /*
     * Creates roaming string of Animal
     * @return Roaming string of Animal
     */
    public String roam(){
        String result = this.name + " of " + getClass() + " is roaming";
        return result;
    }

    /*
     * Superclass verison of eat to be overridden
     * @return Empty string
     */
    public String eat(){
        return "";
    }

    /*
     * Superclass verison of makeNoise to be overridden
     * @return Empty string
     */
    public String makeNoise(){
        return "";
    }

}
