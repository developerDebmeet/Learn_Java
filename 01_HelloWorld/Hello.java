// java is needed to run the application
// javac is needed to compile the application

// Java is platform independent, that machine should have JVM, but JVM itself is platform dependent
// JVM only understands Byte Code

/*
-------------------------------------------------------
Developer > Java Code > Compiler(Javac) > Byte Code

    Byte Code
        v
       JVM [JRE Has JVM and some libraries. When we run something, it runs in JRE, JVM runs it]
        ^
       JRE 
        ^
 Operating System
        ^
    Hardware
-------------------------------------------------------
*/ 

// The Java project may be a multi-file project.
// The execution will start from the file where the main() method is present

class Hello {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}

// Java is an object oriented language. Everything should be an object and to create an object, we need a class.

/*
 * Execution
 * javac Hello.java
 * java Hello
 * 
 */

// We install JDK, JDK has JRE, JRE has JVM.
// WORA : Write Once, Run Anywhere

