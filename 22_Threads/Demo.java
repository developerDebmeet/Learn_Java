// to create threads, we can either extend Thread Class or implement Runnable Interface

class Hi extends Thread {
    public void run() { // override the run method for the thread to work
        for(int i=0;i<100;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}

class Hello extends Thread {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
////////////////////////////////////////////////////////////////////////////////////////////

class Hey implements Runnable { // better to implement Runnable instead of Extending Thread
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("HeY...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Bye implements Runnable { 
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Baaaye...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.run();// Untill all 10 hi are printed, Demo is on hold
        hello.run();

        // 1[least] to 10[max] priority, 5 is by default[normal]
        System.out.println(hi.getPriority());
        System.out.println(hello.getPriority());

        System.out.println("............................................................");
        System.out.println("............................................................");
        System.out.println("............................................................");

        // Start method is present in the Thread class. This wont work with Runnable
        hi.start();     // Starts a thread and executes the run() method 
        hello.start();  // Starts a thread and executes the run() method

////////////////////////////////////////////////////////////////////////////////////////////

        // How to work with Runnable interface? 
        // Create objects
        Hey hey = new Hey();
        Bye bye = new Bye();
        // Create Thread using constructor and pass the Runnable object
        Thread t1 = new Thread(hey);
        Thread t2 = new Thread(bye);
        // Start thread and execute the run() method of passed Runnable objects!
        t1.start();
        t2.start();
////////////////////////////////////////////////////////////////////////////////////////////

        // Using Anonymous
        Runnable runnable = new Runnable() {
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("Running via Runnable :]");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //runnable.run(); // Use this OR
        Thread thread = new Thread(runnable);
        thread .start(); // This also works
////////////////////////////////////////////////////////////////////////////////////////////

        // Using Lambda since Runnable is a Functional Interface
        Runnable runnable2 = () -> {
            for(int i = 0; i < 100; i++) {
                System.out.println("Running via Runnable --{Lambda}-- :]");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        runnable2.run();

        // IN this example all the 6 created threads will be running in parallel

    }
}
