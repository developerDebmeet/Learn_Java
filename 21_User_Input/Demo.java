import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; // Remember these imports!

public class Demo {
    public static void main(String[] args) throws IOException {
        
        System.out.println("hi");
        /*
         * Method println belongs to PrintStream class. So we need to create an object of PrintStream class before using it? Yes!
         * But! out is an object of PrintStream class and it has been created already, hence we can use it directly
         * 
         * And out has been created as a Static variable in the System class
         */
//-----------------------------------------------------------------------------------------------------------------//
        //  System.out.println("Enter a character");
        //  int input = System.in.read(); // in belongs to InputStream class
        //  System.out.println(input); // Returns ASCII of the input character
        //  System.out.println(input-48); // Return the same number, if number is input, as 0 is 48
//-----------------------------------------------------------------------------------------------------------------//

        //  InputStreamReader in = new InputStreamReader(System.in);
        //  BufferedReader bfr = new BufferedReader(in);

        // //bfr.readLine() for input, but gives String 
        
        // int input1 = Integer.parseInt(bfr.readLine());
        // System.out.println(input1);

        // bfr.close();// good practice to close it, because bufferedReader is a resource, 
        // // it can read from file/network/db also and after their usage, they should be closed

//-----------------------------------------------------------------------------------------------------------------//

        Scanner scanner = new Scanner(System.in); // new and better than bufferedReader
        int input2 = scanner.nextInt();
        System.out.println(input2);

        scanner.close();


    }    
}
// Earlier methods commented because these input techniques are interfering with each other