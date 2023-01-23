// This Keyword is quite different in Constructors!!

//Constructors use this to refer to another constructor in the same class 
//with a different parameter list. 

public class Platypus {
       String name;
       Platypus(String input) {
               name = input;
       }
       Platypus() {
               this("John/Mary Doe");
       }
       public static void main(String args[]) {
               Platypus p1 = new Platypus("digger");
               Platypus p2 = new Platypus();
       }
}

//In the code, there are two constructors. The first takes a String input to name the instance.
//The second, taking no parameters, calls the first constructor by the default name "John/Mary Doe"