class A {
    // This method is Ducking the Exception : ie not handling itself and pushing responsibility to callee method.
    public void show(int a) throws Exception { // when we create a method which thows exception wihtout handling it,
                                               // We need to mention that this method throws an Exception, so that the caller
                                               // method can write its handling.
        if(a != 0) {
            throw new Exception("A not 0 exception. Found: " + a );  // we are throwing an exception from this method, 
                                                               // without handling it in try catch
        }
    }
}

public class ThrowsDemo {
    public static void main(String[] args) {
        A a = new A();
        //a.show(69); -> cant use directly : unhandled exception, must keep in try catch.

        try {
            a.show(69);
        }
        catch(Exception e) {
            System.out.println("Caught and handled --> " + e);
            e.printStackTrace(); // shows what is calling what etc with line numbers :fire:
        }
        
    }
}
