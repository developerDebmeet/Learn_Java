public class WrapperDemo {
    public static void main(String[] args) {
       
        int num = 8; // primitive

        Integer num1 = new Integer(5); //This constructor is deprecated
        // We are taking a primitive value and putting it in a wrapper class object
        // This is called Boxing


        System.out.println(num1);

        Integer num2 = 69; // directly assign
        // here Boxing is happening automatically
        // Auto-Boxing


        int num3 = num2.intValue();
        // This is unboxing

        int num4 = num2;
        // This also works : Auto-UnBoxing!


        // String format to integer
        int num5 = Integer.parseInt("609");
    }
}
