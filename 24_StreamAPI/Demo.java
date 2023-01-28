import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {

        //List<Integer> nums = new ArrayList<>();
        //We can use the below syntax to put some values in the list to begin with
        List<Integer> nums = Arrays.asList(5,6,4,1,7,3,0);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(nums);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for(int n : nums)
            System.out.println(n);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        // ForEach gives one element of the array at a time, stored in n
        // then after -> we can write what to do with n
        nums.forEach(n->System.out.println(n));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        // Gives a stream with all the data of nums.
        // Changes to data in stream does not impact nums' values
        Stream<Integer> stream = nums.stream();
        // Once a stream is used, it cannot be reused.
        stream.forEach(s->System.out.println(s));
        //stream.forEach(s->System.out.println(s)); --->Stream has already been operated upon or closed
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Stream<Integer> s = nums.stream();
        Stream<Integer> s2 = s.filter(n->n%2==0); // Only even numbers will survive
        // filter gives a new stream to work with, s2 will have only even nums
        Stream<Integer> s3 = s2.map(n->n*2); // Double all the values of s2
        int result = s3.reduce(0,(c,e)->c+e); // Add all values of s3
        System.out.println(result);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        // All the above operation can be also done on a single line

        int ans = nums.stream()
                        .filter(n->n%2==0)
                        .map(n->n*2)
                        // 0: Initial Value, c: Carry, e: Element
                        .reduce(0,(c,e)->c+e);

        System.out.println(ans);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        // We can also use lambda, since Predicate is a Functional Interface
        Predicate<Integer> predicate = new Predicate<Integer>() {
            public boolean test(Integer n) {
                if(n%2==0)
                    return true;
                return false;
            }
        };
        nums.stream().filter(predicate).forEach(n -> System.out.println(n));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Function<Integer,Integer> function = new Function<Integer,Integer>() {
            public Integer apply(Integer n) {
                return n*1000;
            }
        };
        nums.stream().map(function).forEach(n -> System.out.println(n));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        // Shorter version using lambda
        Function<Integer,Integer> fun = n -> n*69;
        nums.stream().map(fun).sorted().forEach(n->System.out.println(n));
        // .sorted() does what the name suggests!
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        // We can also use nums.parallelStream() instead of nums.stream()
        // To use multiple threads to do the work.


    }
}