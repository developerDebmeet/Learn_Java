public class Demo {
    public static void main(String[] args) {
        
        int anArray[] = {6, 9, 69}; // Array created and initialized, also size will get fixed to 3.

        int array[] = new int[5];   // Array created with fixed size of 5 [all values init to 0]

        anArray[1] = 55;

        System.out.println(anArray[0]); // 6 as expected
        System.out.println(array[3]);   // 0 -> default value of arrays incase they are not initialized.

        // Multidimensional array!
        int multiArr[][] = new int[3][10]; // A big array with 3 arrays of 10 elements each. 3R, 10C

        int randArr[][]  = new int[3][  ]; // We can leave the size of smaller arrays as empty, each smaller array
                                           // can have different length [Jagged Array]
        randArr[0] = new int[69]; // First array of randArr is of size 69
        randArr[1] = new int [5]; // Second array of randArr is of size 5 and so on...
// Printing the randArr's thrid array without making it, will give NullPointerException, as the length of that array is null


        // Below is an enhanced for loop to print the Multidimensional Array
        for(int x[] : multiArr) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println();
        }

        int random = (int) (Math.random() * 100); // Math.random gives a random double value between 0 and 1
        System.out.println(random);

    }
}
