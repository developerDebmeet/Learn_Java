class Calculator {

    int InstanceVariable = 8008;
    
    void aMethod(int localVariable1, String localVariable2) {
        System.out.println("ZZZ  " + localVariable1 + "  " + localVariable2);
        System.out.println(InstanceVariable);
    }
}

public class Demo {
    
    public static void main(String[] args) {
        
        int mainsLocalVariable = 1001;

        Calculator calcy = new Calculator(); // <--- calcy is a reference variable
        calcy.aMethod(69, "Sixty-Naaeen");


        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        calc1.InstanceVariable = 696969;
        System.out.println(calc1.InstanceVariable + " " + calc2.InstanceVariable);
        // Updating calc1's InstanceVarialbe will not affect calc2
        // Since, in the heap, both these objects are created separately and 
        // calc1, calc2 refer to different location
        // In short, they are independent and different objects!

        new Calculator(); // <- this is called ANONYMOUS OBJECT!
        // when this is done, constructor is called and object is created
        // but it is not really accessible, since object is in Heap with no
        // refernce present in Stack of the main/calling function!

        new Calculator().aMethod(0,"0");
        // we can use anonymous objects to call its methods!
    }

}

/*
 * Every Method has its own STACK [LIFO]
 * 
 * for Main's STACK, mainsLocalVariable is a local variable
 * calcy's LOCATION is also a local variable for main method
 * the actual calcy object is present in the HEAP memory along with its InstanceVariable
 * calcy's aMethod Signature is present in the HEAP, but its Execution memory is in its STACK
 * STACK and HEAP are related via pointers! 
 * calcy with its HEAP memory location is stored in STACK!!
 */

 /*
  
 STACK : someLocation  : [(calcy, 1001)]
 HEAP  : Location_1001 : [(InstanceVariable,5),(aMethod(.....))]



  */