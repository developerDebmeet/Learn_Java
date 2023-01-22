public class SBuffer {
    public static void main(String[] args) {
        // StringBuffer gives a way to implement mutable Strings

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        // By default 16 bytes string buffer size
        // And by default, it is empty string, just like Strings
        System.out.println(sb);

        // We can give an initial String also
        StringBuffer sb2 = new StringBuffer("Debmeet");
        System.out.println(sb2.capacity());
        // Size is 16 more than the provided String
        System.out.println(sb2.length());
        // Gives length of String
        // Therefore, initial sb2.capacity() = 16 + sb2.length()
        System.out.println(sb2); // Output of the String
        sb2.append(" Banerjee");
        // As the name Suggests, appends the string
        System.out.println(sb2);

        String str = sb2.toString(); // We can convert SB to String

        // there are other methods avaialbe also, like
        sb2.deleteCharAt(7);
        System.out.println(sb2);
        // instert, substring, setLength, ensureCapacity etc


        /*
         * There is another class StringBuilder
         * StringBuffer is thread safe and StringBuilder 
         * is not thread Safe.
         */


    }    
}
