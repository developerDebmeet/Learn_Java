// Reverse your website domain name to create name
// for package, in order to make in unique in world
package com.debmeetbanerjee.packages;

//These are the imports
import com.debmeetbanerjee.packages.calculatorCollection.AdvCalc;
import com.debmeetbanerjee.packages.calculatorCollection.Calc;

// default imports
import java.lang.*;
import java.lang.System;
// the above is a default import, not mentioned explicitly
// System is in java.lang only and it is already imported by default


import com.debmeetbanerjee.packages.other.*;

class E {
    private int marks = -1111;
}

public class Demo {
    private int marks = 609;

    public static void main(String[] args) {

        Calc obj = new Calc();
        AdvCalc obj2 = new AdvCalc();

        System.out.println("HI"); 


        A a = new A();
        //System.out.println(a.marks);
        // This is an error : 
        // the Field A.marks is not visible

        B b = new B();
        System.out.println(b.marks);
        // No Error, because marks is public in B

        C c = new C();
        System.out.println(c.marks);
        // No Error, although marks is not public in C
        // but the package of C is same as Demo.java

        D d = new D();
        //System.out.println(d.marks);
        // Error, although package is same!
        // but marks is private here!

        E e = new E();
        //System.out.println(e.marks);
        // Error, same file still
        // Actually same file and same package is same thing
        // Same error as D

        Demo demo = new Demo();
        System.out.println(demo.marks);
        // this is not error
        // Private can only be accessed in same class


    }
    
}

/*
 * PRIVATE   : only same class
 * PUBLIC    : everywhere
 * DEFAULT   : everywhere within same package
 * PROTECTED : DEFAULT + Differt package subclass
 * 
 */

// We cannot have 2 public classes in same file!