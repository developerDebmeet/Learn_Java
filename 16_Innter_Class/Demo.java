class A {
    public void show() {
        System.out.println("An Old Version of A show v1.1.3");
    }
}



abstract class Fan {
    public abstract void spin();
}


public class Demo {
    public static void main(String[] args) {
        A aOld = new A();

        aOld.show(); // Old version of Show

        // Anonymous Inner Class
        A aNew = new A() { // this is an inner class, to override the functionality of a method, without creating a Child class and overriding the method
            public void show() { // New implementation of the same method. Access modifier and type should match
                System.out.println("A New Version of A show v2.69.0");
            }
        };// Semicolon!!!!!!

        aNew.show(); // New version of Show


        A a = new A() {} ; // Just normal declaration of new object. Inside Curly Braces is the anonymous inner class!! 



        Fan f = new Fan() {
            public void spin() {
                System.out.println("Spinnnnning... Cool air incoming!");
            }
        };

        f.spin(); // how the hell were we able to create an object of Fan Class, although it was abstract?

        // Actually this object is not of class Fan. It is an object of the anonymous class as declared on line 38.
        // These classes are getting named as Demo$1.class, Demo$2.class etc...
    }
}
