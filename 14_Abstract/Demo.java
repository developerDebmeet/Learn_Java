// An OEM Car Body, wihtout an engine. Has an Inbuilt Radio + Music Player
abstract class IncompleteCar {

    public abstract void drive(); 
        // Method present without any implementation.
        // playMusic has implementation details present in it

    public void playMusic() {
        System.out.println("Car stereo is ON!");
    }
}


// Whenever we have an abstract Method, that class also needs to be abstract
// But we can have an abstract class, without abstract method.
abstract class Greetings {
    public void sayHello() {
        System.out.println("Hello!!!!! <3 :)");
    }
}


// We must implement the inherited abstract methods [drive() in this example]
class FullCar extends IncompleteCar { // this is called a CONCRETE class, as opposed to abstract Class
    public void drive() {
        System.out.println("Engine installed!, Car is on!!!!");
    }
}
// A useable car, after Installing Engine, ready to drive!



abstract class UpdatedIncompleteCar extends IncompleteCar { // If we are unable to implement the abstract methods in the derived class, 
                                                            // Derived class also should be abstract!
    
    public void updated() {
        System.out.println("A new version of incomplete Car, still no Engine");
    }
}



public class Demo {
    public static void main(String[] args) {

        // IncompleteCar incompleteCar = new IncompleteCar();
        // We cannot create objects of abstract classes.
        // why? Because no one would like to have a Car, which does not have an engine

        FullCar car = new FullCar();
        car.drive();
        car.playMusic();
        
    }    
}
