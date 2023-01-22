public class Demo {
    public static void main(String args[]) {
        String temp = "Hello";
        // This works

        String name = new String();
        // Since Strings are objects, we should use this syntax.
        // Default value of Strings are empty Strings.

        // int, float are starting from small letters,
        // while String starts from capital letter, 
        // indicating it is a Class!

        // Since String is a Class, the value is actually 
        // Stored in Heap, and it is a reference variable.

        System.out.println(temp + " " + name);


        // Making and init a String ::
        String abc = new String("ABC");
        System.out.println(abc);


        // String Constant Pool
        String s1 = "Debmeet";
        String s2 = "Debmeet";
        // 2 Different strings, but the value against 
        // s1 and s2 in main's Stack will be same
        // Proof : 
        System.out.println(s1 == s2);

        /*
         * Actually this is a way to save memory
         * So strings that have the same value can refer to 
         * the exact same location, instead of creating a
         * new object in heap with exactly same content.
         */

         // Strings are immutable!
         String first = "First";
         first = first + " String";
         System.out.println(first); // OP : First String
         // This is showing that the value of 'first' got 
         // updated!, how the hell is it immuatble then?

         /* 
          * Actually, the old heap location of first, still has
            the value "First". An update like this, creates a 
            new entry in the HEAP with the content "First String"
            and its location is stored against the variable "first"
            in the STACK. 

            So the old string location still has the value "First"
            and it has not been changed, hence its really immutable!!

          */
    }
}
