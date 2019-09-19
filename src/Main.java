public class Main {

    public static void main(String[] args) {

    	Zookeeper Zoe = new Zookeeper();

    	//Each subclass is polymorphically instantiated as Animal
    	Animal Frank = new Feline("Frank");
    	Animal Fiona = new Feline("Fiona");
    	Zoe.addAnimal(Frank);
    	Zoe.addAnimal(Fiona);


    	Animal Catthew = new Cat("Catthew");
		Animal Carl = new Cat("Carl");
    	Zoe.addAnimal(Catthew);
    	Zoe.addAnimal(Carl);

		Animal Chloe = new Canine("Chloe");
		Animal Cassidy = new Canine("Cassidy");
    	Zoe.addAnimal(Chloe);
    	Zoe.addAnimal(Cassidy);

		Animal William = new Wolf("William");
		Animal Winnie = new Wolf("Winnie");
    	Zoe.addAnimal(William);
    	Zoe.addAnimal(Winnie);

    	//Call Zookeeper methods
        System.out.println("Zookeeper is waking animals.\n");
    	Zoe.wake();

        System.out.println("------------------------------------");
        System.out.println("Zookeeper is roll calling animals.\n");
    	Zoe.rollCall();

        System.out.println("------------------------------------");
        System.out.println("Zookeeper is feeding animals.\n");
    	Zoe.feed();

        System.out.println("------------------------------------");
        System.out.println("Zookeeper is letting animals roam.\n");
    	Zoe.letRoam();

        System.out.println("------------------------------------");
        System.out.println("Zookeeper is closing the zoo.\n");
    	Zoe.closeZoo();

    }
}
