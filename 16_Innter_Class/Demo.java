import javax.xml.crypto.AlgorithmMethod;

class A {
    public void show() {
        System.out.println("An Old Version of A show v1.1.3");
    }
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
    }
}
