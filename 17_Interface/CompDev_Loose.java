interface Computer {
    void code();
}
/*
 * This is a good use case of Interfaces. They help in making things general instead of specialized. Dev need a computer to work on.
 * It should not matter whether the computer is a lapotp or desktop or anything else.
 * 
 * Humans usually express themselves in generic terms only. We say that My "home" is in New Delhi. We do not specifically call it out
 * like "My flat is in New Delhi" OR "My villa is in New Delhi". Home is generic.
 */
class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile and run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile and run better <::::::> On Desktop with external Monitor 27Inches :)");
    }
}

class Developer { // Devloper needs a Computer to code only. Computer maybe laptop, desktop or any other new device if it is launched and it can just implement computer.
    Developer(Computer c) {
        c.code();
    }
}

public class CompDev_Loose {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer employee1 = new Developer(laptop);
        Developer employee2 = new Developer(desktop);

        // Whether Employee gets laptop or desktop, it wont matter and job will be done.
    }
}
