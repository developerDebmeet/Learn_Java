import javax.swing.event.SwingPropertyChangeSupport;

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

class A {
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

class B extends A {
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
