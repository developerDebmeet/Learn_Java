class Laptop {
    String brand;
    int price;
}

class BrandNewLaptop {
    String brand;
    int price;

    @Override
    public String toString() {
        return "Get the Brand new " + brand + " Laptop at Rupees : " + price + "/- only";
    }

    public boolean equals(BrandNewLaptop bnl) {
        return this.price == bnl.price && this.brand == bnl.brand;
    }

}
public class Demo {
    public static void main(String[] args) {
        // Every class extends the Object class, whether mentioned explicitly or no

        Laptop myLaptop = new Laptop();
        myLaptop.brand="Asus";
        myLaptop.price=1000;

        Laptop hisLaptop = new Laptop();
        hisLaptop.brand="HP";
        hisLaptop.price=950;

        System.out.println(myLaptop);  // Output : Laptop@3fee733d
        System.out.println(hisLaptop); // Output : Laptop@5acf9800
        // this output is actually the output of the toString method of that class.
        // Whenever we try to print the object of a class, we get output of the toString method

        System.out.println(myLaptop.toString());  // Output : Laptop@3fee733d
        System.out.println(hisLaptop.toString()); // Output : Laptop@5acf9800
        // The above output is identical, hence we can say for sure that the output is from toString();

        // BUT! We never defined any method like toString in our class. Moreover, there isnt any method in our class at all
        // toString() is a method of the Object class and due to inheritance, we are able to access it in out class!!

        // The output of the toString() actually is [Class Name @ HashCode] HashCode is a unique string derived from the data present in the object!

        Laptop l1 = new Laptop();
        l1.price = 50;
        l1.brand = "Apple";

        Laptop l2 = new Laptop();
        l2.price = 50;
        l2.brand = "Apple";

        System.out.println(l1==l2);                          // false
        System.out.println(l1.equals(l2));                   // false


        BrandNewLaptop l3 = new BrandNewLaptop();
        l3.price = 50;
        l3.brand = "Apple";

        BrandNewLaptop l4 = new BrandNewLaptop();
        l4.price = 50;
        l4.brand = "Apple";

        System.out.println(l3==l4);                          // false
        System.out.println(l3.equals(l4));                   // true
        
        /*
         * The main difference between the .equals() method and == operator is that one is a method, and the other is the operator.
           We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. 
           In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
           If a class does not override the equals method, then by default, it uses the equals(Object o) method of the closest parent class that has overridden this method. 
         * 
         */


         String s1 = "HELLO";
         String s2 = "HELLO";
         String s3 =  new String("HELLO");
  
         System.out.println(s1 == s2); // true
         System.out.println(s1 == s3); // false
         System.out.println(s1.equals(s2)); // true
         System.out.println(s1.equals(s3)); // true

         /*Both s1 and s2 refer to same objects.
           When we use the == operator for s1 and s2 comparison, the result is true as both have the same addresses in the string constant pool. 

           using the new keyword, allocates the string in HEAP but outside the String pool therefore s1 and s3 have different locations!

           String pool is a storage space in the Java heap memory where string literals are stored. 
           It is also known as String Constant Pool or String Intern Pool. 
           It is privately maintained by the Java String class
          */


        String str = "Java";
        String str1 = new String("Java").intern();
        System.out.println("using Intern  : " + (str == str1));
        /*
         * Creating strings using the new keyword allocates memory to the string object in the heap but outside the string constant pool.
         * When we use the String.intern() method, JVM puts the string literal in the String Pool (if not already present), and its reference is stored in the variable. 
         * However, if the String Constant Pool already contains a string equal to the String object to be created, its reference is returned.
         */



        BrandNewLaptop laptop = new BrandNewLaptop();
        laptop.brand = "Dell";
        laptop.price = 1999;

        System.out.println(laptop); // this is the more common way of using the toString method!


    }
}
