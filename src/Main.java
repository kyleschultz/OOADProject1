public class Main {

    public static void main(String[] args) {

    	Zookeeper Zoe = new Zookeeper();

    	Feline Frank = new Feline("Frank");
    	Feline Fiona = new Feline("Fiona");
    	Zoe.addAnimal(Frank);
    	Zoe.addAnimal(Fiona);

    	Cat Catthew = new Cat("Catthew");
    	Cat Carl = new Cat("Carl");
    	Zoe.addAnimal(Catthew);
    	Zoe.addAnimal(Carl);

    	Canine Chloe = new Canine("Chloe");
    	Canine Cassidy = new Canine("Cassidy");
    	Zoe.addAnimal(Chloe);
    	Zoe.addAnimal(Cassidy);

    	Wolf William = new Wolf("William");
    	Wolf Winnie = new Wolf("Winnie");
    	Zoe.addAnimal(William);
    	Zoe.addAnimal(Winnie);

    	Zoe.wake();
    	Zoe.rollCall();
    	Zoe.feed();
    	Zoe.letRoam();

    	Zoe.closeZoo();

    }
}
