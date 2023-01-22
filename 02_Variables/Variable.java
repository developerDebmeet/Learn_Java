/*
 * Primitive :
 * *Integers  : byte[1], short[2], int[4], long[8]
 * *Decimals  : float[4], double[8]
 * *Character : char[2]
 * *Boolean   : boolean
 * *Range : -2^(numOfBits-1) to 2^(numOfBits-1)-1
 * *eg : Byte : numOfBytes = 1; numOfBits = 8;  -2^7 to 2^7 -1 :: -128 to +127 => 255 numbers [2^8 -1]
 */

public class Variable {
    public static void main(String args[]) {

        int number = 5;
        float flt = 5.5f; //default decimal values are double type, hence f at the end is needed
        double dbl = 3.4;
        char chr = 'a'; // supports Unicode by default, not ASCII, double quotes cannot be used, it is for String
        boolean isNoob = true;
        long lowng = 44445l; // have to specify an l at the end
        int fiveInBinary = 0b101;
        int fourteenInHex = 0xE;
        int easyToRead = 1_23_000; // its value is same as 123000
        double exponentDouble = 123e2; // 12300.0

        System.out.println(exponentDouble);

        //Automatic is conversion
        //Explicitly is casting

        int a = 5;
        byte b = 6;
        a = b ; // (implicit/automatic type conversion)
        b = (byte)a; // (explicit type casting)
        
        // Smaller range to larger range happens automatically, larger to smaller needs explicit conversion
        // float and int have some number of bytes, float behaves as the larger one
        float f = 1.1f;
        int i = 2;
        f = i;
        i = (int)f;


        byte bb;
        int higherThanByteRange = 257;
        bb = (byte)higherThanByteRange; // ans is 1 => 257%256, ie value%range, 256 would have become 0. 255 will be unaffected

        System.out.println(bb);

        // Type promotion, b1,b2 lie in range of byte, but b1*b2 exceeds range, hence, its type is promoted.
        byte b1 = 10;
        byte b2 = 30;
        int promoted = b1*b2;

        // if we call add(5,6) and signature is add(int a, long b) -> this will work, since 6 gets promoted to long b, and there is no ambiguity
        // if there are two methods, add(long a, int b) and add(int a, long b) -> this wont work, due to ambiguity 
        // this is also type promotion

        


    }
}
