class StringMisMatchException extends Exception {
    StringMisMatchException(String string) {
        super(string); // using super's constructor to print the Exception message as for other exceptions
    }
}


public class Demo {
    public static void main(String[] args) {
        //System.out.Println("ABC");
        // Above is a compile time, syntactical error. During compilation, compiler will tell that Println is not found. [Capital P]

        // int i = 0;
        // int j = 69 / i ; //  Runtime error : / by 0 java.lang.ArithmeticException
        // System.out.println(j);


        int i = 0;
        int j = 5;

        try {
            j = 69/i;
        }
        catch(Exception exception) { // Exception will catch any exception that happens, no matter the type.
            System.out.println("Exception Happened, Thrown by compiler and caught by Developer :) ");
            System.out.println(exception);
        }

        System.out.println(j);
        System.out.println("Program Excuted"); // This Statement wont be executed if runtime error happens and no handling is done.


        // Specific Error handling

        try {
            // Some Code here
            // this code has possibilities of NullPtr and IndexOutOfBounds
        }
        catch(NullPointerException npe) {
            System.out.println("NULL PTR happened!!!" + npe);
        }
        catch(ArrayIndexOutOfBoundsException aioob) {
            System.out.println("Cannot access that Index!!! Its out of Bounds...");
            // So basically, using this syntax, we can handle each possible expection differently
        }
        catch(Exception e) {
            // It is better to have this in the end to make sure if developer missed special handling of one of the exceptions
            // That can be caught here. 
        }


        // Throwing an exception forcefully based on some condition, using "throw new()" syntax
        try {
            String s= "Hello";
            if(s!="hello") {
                throw new Exception("String no match Error!");
            }
        }
        catch(Exception e) {
            System.out.println("OOPS! " + e);
        }


        // Throwing Custom Exception
        try {
            String s= "Hello";
            if(s!="hello") {
                throw new StringMisMatchException("String no match Error!"); // throw Custom Exception
            }
        }
        catch(StringMisMatchException e) { // custom
            System.out.println("OOPS! :( " + e);
        }
    

    }

    public static int add(int a, int b) {
        return a-b; // This is a logical error. Program works fine according to the code, but the user was expecting addition to happen instead of substraction. This is a bug  
    }
}

// most java interfaces end in the suffix 'able' eg Runnable, Serializable etc BUT Throwable is a Class :]

/* Class Inheritance Hierarchy For Exceptions 
 * 
 * 
 * 
 * 
 * 
 *                                              > etc
 *                                              > SQLException
 *                                              > IOException
 *                                              > RuntimeException ---> Arithmetic,NullPtr,OutOfBounds etc          
 *                          ---> Exception -----
 *                          -
 * Object ---> Throwable --[
 *                          -
 *                          ---> Error ---------
 *                                              > OutOfMemory
 *                                              > ThreadDead
 *                                              > VM Error
 *                                              > IO Error
 *                                              > etc
 * 
 * 
 * 
 *                                                   
 * All the Runtime exceptions are called Unchecked Exceptions
 * While other exceptions like SQL/IO Exceptions are called Checked Exceptions
 * 
 * Compiler makes it mandatory to handle checked exceptions, while it is dev's choice to handle unchecked exceptions or let it be
 * 
 *                     
 */