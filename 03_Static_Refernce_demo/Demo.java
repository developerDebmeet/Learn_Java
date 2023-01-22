class StaticCalculator {
    static int add() {
        System.out.println("StaticCalc Add");
        return -1;
    }
}

class Calculator {
    int add() {
        System.out.println("Calc Add");
        return -1;
    }
}

public class Demo {
    public static void main(String args[]) {

        StaticCalculator.add(); // Call cirectly, without object [Because of STATIC]

        Calculator calc = new Calculator();//-----------> Object Creation
        calc.add();
        // Calculator abc;  -------> Cant do this directly : error: variable abc might not have been initialized
        // abc.add();

        int a;
        /*
         * "a" is called as primitive data type
         * "calc" is called non primitive OR reference data type
         */
    }
}
