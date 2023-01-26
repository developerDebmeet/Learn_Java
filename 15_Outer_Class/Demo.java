// Outer Class cannot be Static
class A {
    private int variableOfA;
    public void showOfA() {
        System.out.println("In A Show");
    }

    class DependentOnA {
        public void showOfB() {
            System.out.println("In B Show");
        }
    } // Compiled class file looks like : A$DependentOnA.class

    static class AnotherDependentOnA {
        public void showOfC() {
            System.out.println("In C Show");
        }
    } // Compiled class file looks like : A$AnotherDependentOnA.class
}



public class Demo {
    public static void main(String[] args) {
        A a = new A(); // Works
        a.showOfA();

        // DependentOnA dependentOnA = new DependentOnA();
        // Error : DependentOnA cannot be resolved to a type 

        // Actually DependentOnA is not openly available, it is a part of A.
        // Hence the below syntax needs to be followed and also, an object of A will be needed for creating an object of DependentOnA
        A.DependentOnA dependentOnA = a.new DependentOnA(); 
        dependentOnA.showOfB();

        // if inner class is static, It can work without object of A as below
        A.AnotherDependentOnA anotherDependentOnA = new A.AnotherDependentOnA();
        anotherDependentOnA.showOfC();

    }    
}
