import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyDemo {
    public static void main(String[] args) throws IOException {
        
        try {
            System.out.println(0/0);

            // A stmt here would not get executed if error on line 5;
        }
        catch(Exception e) {
            System.out.println(e);

            // A stmt here would not get executed if no error on line 5;
        }
        finally {
            System.out.println("Closing all Resources");
            // Finally block is executed whether or not the exception occurs.
            // A stmt here would get executed regardless of error or not on line 5;
        }

        /*
         * We can also skip catch and use only finally with try
         * 
         * eg : try doing a file operation and got an error in between
         * 
         * in finally we can put file closing statements and free up the resources for others/other services to use
         */

         BufferedReader bfr = null;
         int num = 0;
         try {  
            System.out.print("Enter New Number : ");
            bfr = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(bfr.readLine()); 
         }
         finally {
            System.out.println(num);
            bfr.close();
         }

         // There is an even better way to do this. Using try with resources

         try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(0/0);
            // Exception occurs, but This resource br will get closed automatically, due to AutoClosable
         }

         System.out.println("GAME - OVER"); // This will not get executed, since exception at 47 is unhandled and 
         // program will terminate there, but, the resource br is closed.
    }
}
