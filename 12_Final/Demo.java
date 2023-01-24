final class Calc {
    final void show() { // if class is not final, but a method is final, that method cannot be overridden by child classes
        System.out.println("In Calc Show");
    }
    void add(int a, int b) {
        System.out.println(a+b);
    }
   
}

// class AdvancedCalc extends Calc {
// Cannot extend [Inherit] a final class. 
// So final keyword in classes can be used to stop inheritance
// }

public class Demo {
    
    public static void main(String[] args) {
        final int dSize = 6;
        // This is a constant now, its value cannot be changed now!


        Calc calc = new Calc();
        calc.show();
        calc.add(10,59);

    }
}

/*
 * Summary : 
 * Final Variable : Constant, no reassignment once a value is set;
 * Final Method   : If class is inherited, the child class cannot override the final method;
 * Final Class    : Stop inheritance, no other class can extend the final class
 */