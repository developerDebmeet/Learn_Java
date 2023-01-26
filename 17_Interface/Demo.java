abstract class A {
    public abstract void show();
    public abstract void hear();
}

// If there is a class like A, where all methods in it are abstract, we can consider using an Interface like B
// Interfaces are not classes and hence object cant be created from them
// Also interface by default has "public abstract" in its methods, so no need of mentioning them!
// Functionality wise, class A and Interface B are identical

interface B {
    void show();
    void hear();

    // Interface can have varialbes too, but by default, they are FINAL and STATIC
    double PI = 3.14; // so value needs to be given here directly
}

// interface provides a design of the class. That for creating the class, you would require these methods
// implement them, and get your working class!

class C implements B { // Class C would need to implement all the methods present in its interface.
    // to make a class from interface, we use "implements", for inheritance, we use "extends"
    @Override
    public void show() {
        // TODO Auto-generated method stub
    }
    @Override
    public void hear() {
        // TODO Auto-generated method stub
    }
}

public class Demo {
    public static void main(String[] args) {

        System.out.println(B.PI); // Static varialbe, use directly :)
        System.out.println(C.PI);


        B b = new C(); b.show();b.hear(); // we can use ref of B or C for making the objects, but the class will be of C only!
        C c = new C(); c.show();c.hear();

        
    }
}

interface X {
    void xxx();
}

interface Y {
    void yyy();
}

interface XY extends X,Y { // An interface can extend other Interfaces(multiple)
    void xyxyxy();
}
class ZZ implements XY { // This class will have to implement all the inherited methods of parent interfaces of XY as well!
    public void xxx() {
    }
    public void yyy() {
    }
    public void xyxyxy() {
    }
}

class Z implements X,Y { // A class can implement multiple Interfaces, provided, it implements all of their methods!
    // this is where interface wins compared to abstract classes with all abstract methods. 
    // A class can implement multiple interfaces, whereas only One Abstract(in fact any kind of)Class.
    @Override
    public void xxx() {
        // TODO Auto-generated method stub
    }
    @Override
    public void yyy() {
        // TODO Auto-generated method stub
    }
}