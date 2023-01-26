// An interface with only one method is known as Functional Interface
// This is Also called [SAM] ie Single Abstract Method Interface 

@FunctionalInterface // Helps the compiler know we want a Functional Interface. If we try to add another method in this interface, it will give an error due to this annotation.
// otherwise it would simply allow any number of methods and it would mean dev is responsible to keep only one method in the FunctionalInterface.
interface A {
    void show();
}

class B implements A {
    @Override
    public void show() {
        System.out.println("Overridden A Show, B show!!");
    }
}

@FunctionalInterface
interface BookARoom {
    void book(String name, int hrs);
}

@FunctionalInterface
interface C {
    void show(int anyRandonName);
}

@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        A a = new B();
        a.show();

        A a2 = new A(){
            public void show() {
                System.out.println("Overridden A Show, Using Anonymous Inner Class!!");
            }
        };
        a2.show();

        // Java 8 has some new features with Functional Interfaces -> Lambda Expressions.
        // Lambda Expressions work only with Functional Interfaces and they tend to make the code a bit less verbose.
        // Verbose code means very readable and long code, which is good. But long code is also bug prone and hence 
        // features like lambdas are good.

        A a3 = () -> {  // Just like the Anon Inner. But the new keyword and the function name, type etc is already understood since there is only one method and if we will override it,
                        // it will be that exact method only, hence we can avoid all that code.
            System.out.println("Overridden A Show, Using Lambda Expressions!!!");
        };
        a3.show();

        // Even the Curly braces can be dropped if it is single line 
        A a4 = () -> System.out.println("Overridden A Show, Using Single Line Lambda Expression!!!");
        a4.show();

        BookARoom b = (name, hrs) -> {
            System.out.println("Hi " + name + " Your room is booked for " + hrs + " hours. Have fun ;) :wink: :wink:");
        };
        b.book("Debmeet", 3);

        C c = i -> System.out.println("Rating : " + i); // If there is only one varialbe, no need for round brackets as well. Super short Code!
        c.show(5);


        Addition addition = (i,j) -> i+j; // we should not write return keyword when there is single statement without braces.
        int niceResult = addition.add(66,3);
        System.out.println(niceResult);

        Addition addition2 = (i,j) -> {return i+j; }; // Alternative of above, but above is better.


        // Functional Interfaces + lambda expression after compilation do not get new files. Their code is added in the same Class where the main method is present 
        // Anon Inner Classes, get their own .class file
    }    
}   