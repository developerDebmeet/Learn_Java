// This Keyword in Constructors!!

//Constructors use "this" to refer to another constructor in the same class 
//with a different parameter list. 

public class Platypus {
        String name;

        Platypus() {
                this("Debmeet"); //<- Use "this" keyword to call other constructors of same class!
                System.out.println("platypus default");
        }

        Platypus(String s) {
                System.out.println("platypus String s");
        }

        Platypus(int n) {
                this(); // Calls the Default constructor of Platypus

                System.out.println("platypus int n");
        }

        public static void main(String args[]) {

                Platypus p1 = new Platypus(69);

        }
}