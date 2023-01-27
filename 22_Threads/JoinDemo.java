class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable r1 = () -> {
            for(int i=0;i<100000;i++) {
                counter.increment();
            }
                
        };
        Runnable r2 = () -> {
            for(int i=0;i<100000;i++)
                counter.increment();
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join(); // Finish t1's execution before main thread proceeds ahead
        t2.join(); // Finish t2's execution before main thread proceeds ahead

        System.out.println(counter.count);


        // For correct output, we need both the synchronized keyword : for Thread Safety
        // And join() so that main waits for t1 and t2 to complete before executing line 32;
    }
}
