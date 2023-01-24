// Polymorphism means many kinds of behaviour

// 2 types : Compile Time [Early Binding] Overloading and 
//           Run     Time [Late  Binding] Over-riding


class A {
    public void show() {
        System.out.println("in show of A");
    }
}

class B extends A {
    public void show() {
        System.out.println("in show of B");
    }
}

class C extends A {
    public void show() {
        System.out.println("in show of C");
    }
}


public class Demo {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();
        // in show of A

        // Ref can be reassigned {also to child class objects}
        // Ref of parent but object of child, works
        obj = new B();
        obj.show();
        // in show of B

        obj = new C();
        obj.show();
        // in show of C

        // Obj show is giving differnt results each time
        // hence it is behaving differently
        // this is also polymorphism
        // this is Called DYNAMIC METHOD DISPATCH [Runtime Polymorphism]
/*
When an overridden method is called through a superclass reference, 
Java determines which version(superclass/subclasses) of that method is to be executed 
based upon the type of the object being referred to at the time the call occurs. 
Thus, this determination is made at run time.
At run-time, it depends on the type of the object being referred to (not the type of the reference variable) 
that determines which version of an overridden method will be executed
A superclass reference variable can refer to a subclass object. 
This is also known as UPCASTING. 
Java uses this fact to resolve calls to overridden methods at run time.
 */

    A object = (A) new B(); //  UPcasting, same as A object = new B(); that (A) is understood by default and need not be written
    object.show();

    B object1 = (B) object; //  DOWNcasting
    object1.show();


       
    }
}
