class Human {
    private int age;
    private String name;

    Human() {  // Default constructor
        age = 0;
        name = "Default_Name";
    }
    // The above constructor [no parameters] is made by Java, even if we do not mention it.
    // It is blank when auto generated.

    Human(int age, String name) {  // Parameterized Constructor
        this.age = age;
        this.name = name;
    }
}


class xyz extends Object {
    // Every class in Java extends the object class and it need not be mentioned
    // Explicitly. Below, we have not written but class A is extending Object class
    // Calling super of A means calling constructor of Object class
}

class A { // Parent/Base/Super Class
    public A() {
        //super(); <-- Super is here as well, but no real affect
        System.out.println("in A");
    }

    public A(int parameter) {
        //super(); <-- Super is here as well, but no real affect
        System.out.println("in A with parameter");
    }

    public A(String parameter) {
        //super(); <-- Super is here as well, but no real affect
        System.out.println("in A with String!!!");
    }
}

class B extends A { // Child/Derived/Sub Class 
    public B() {
        super(); // <------------Mention super or not, it is always there!
        // this is why the default constructor of A is being called!
        System.out.println("in B");
    }

    public B(int parameter) {
        super(); // <------------Mention super or not, it is always there!
        System.out.println("in B with parameter");
    }

    public B(String parameter) {
        super("hi"); //<-- if we mention a parameter in super constructor call
        // then obviously the corresponding constructor of A will be called and 
        // default constructor of A wont be called.
        System.out.println("in B with String!!!");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        // in A
        // in B
        // When the object is created, constructor of superclass is called and then of subclass

        B obj2 = new B(0);
        // in A
        // in B with parameter
        // Default of A called ["in A with parameter" not used]

        B obj3 = new B("hellow");
        // in B with String!!!
        // in A with String!!!

    }
}


/*
 * In Above example, B extends A, A extends Object;
 * B does not extend Object. 
 * This is Multi-Level Inheritance, and not Multiple Inheritance!!!
 * 
 * Anyway Multiple Inheritance Does not exist in Java
 * 
 */

 class Calculator {
    int amazingCalculation() {
        return 0;
    }
 }

 class ScientificCalculator extends Calculator {
    @Override
    int amazingCalculation() {
        return -1;
    }
//  @Override annotation informs the compiler that the element is meant 
//  to override an element declared in a superclass.

//While it is not required to use this annotation when overriding a method, 
//it helps to prevent errors. If a method marked with 
//@Override fails to correctly override a method in one of its superclasses, the compiler generates an error.
 }



 // Inheritance creates an Is-A relationship between classes
 // Example : ScientificCalculator IS A Calculator