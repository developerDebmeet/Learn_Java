class Laptop {
    void code() {
        System.out.println("code, compile and run");
    }
}

class Developer { // Devloper needs a laptop to code, cannot work without Laptop
    Developer(Laptop l) {
        l.code();
    }
}

public class CompDev_Tight {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Developer developer = new Developer(laptop); // Laptop object here is becoming necessary here for the developer to work
        // If The employer gives Desktop instead of laoptop to employee Developer, he wont be able to accept it and write code,
        // Although Desktop should be perfectly fine for the developer to work on. Maybe even better
    }
}
