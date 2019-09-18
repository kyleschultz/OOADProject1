public class Animal {
    private String name;
    private Boolean is_asleep;

    public Animal() {
        this.is_asleep = true;
    }

    public Animal(String name){
        this.name = name;
        this.is_asleep = true;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Boolean getAsleep() {
        return is_asleep;
    }

    public String setAsleep(Boolean asleep) {
        this.is_asleep = asleep;
        if(!this.is_asleep) {
            return this.name+ " of " + getClass() + "" + " is awake";
        }
        else{
            return this.name + " of " + getClass() + "" + " is sleeping";
        }

    }

    public String roam(){
        String result = this.name + " of " + getClass() + "" + " is roaming";
        return result;
    }

    public String eat(){
        return "";
    }

    public String makeNoise(){
        return "";
    }

}
