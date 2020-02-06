package OOP.DogDemo;

class Dog{
    String name;
    int numLegs;
    String breed;
    boolean fleas;
    boolean hungry;

    //creating more functions
    //a status indicator
    boolean isHungry() {
        return hungry;
        }
    void eat(){
        hungry = false;
        }
    void play(){
        hungry = true;
        }

    }


public class DogDemo {

    public static void main(String[] args) {

        Dog spot = new Dog();
        spot.name = "Spot";
        spot.numLegs = 3;
        spot.breed = "Collie";
        spot.fleas = true;

        System.out.println("Name: " + spot.name);
        System.out.println("Breed: " + spot.breed);
        System.out.println("Number of legs: " + spot.numLegs);
        System.out.println("Has fleas? " + spot.fleas);

        spot.play();
        System.out.println("Hungry? " + spot.hungry);
        if (spot.isHungry()) {
            spot.eat();
            //spot will eat because he is currently hungry
        }
        //spot will now be full
        System.out.println("Hungry? " + spot.hungry);


        //second dog
        Dog fluffy = new Dog();
        fluffy.name = "Fluffy";
        fluffy.numLegs = 4;
        fluffy.breed = "Maltese";
        fluffy.fleas = true;


        System.out.println("Name: " + fluffy.name);
        System.out.println("Breed: " + fluffy.breed);
        System.out.println("Number of legs: " + fluffy.numLegs);
        System.out.println("Has fleas? " + fluffy.fleas);

    }

}

