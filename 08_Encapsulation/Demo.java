class Human {
    private String name;
    private int age;
    private float weight;

    public void setName(String name) {
        this.name = name;
        // this keyword helps us identify the object that has called the method
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public float getWeight() {
        return weight;
    }
}

public class Demo {
    public static void main(String[] args) {
        /*
         * Encapsulation is one of the 4 OOP pillars.
         * others : {inheritance, polymorphism, abstraction}
         * 
         * It is the mechanism of wrapping the data(variables) and
         * code acting on the data(methods) together as a single unit
         * The variables of a class will be hidden from other classes and 
         * can be accessed only through the methods of their current class.
         * There is is also known as data hiding.
         * 
         * To achieve Encapsulation in java : 
         * - Declate the variables of a class as private
         * - Provide public getters and setters
         */
    }    
}

/*
Out of many, let's cover some of the most important benefits of using getters and setters:

It helps us achieve encapsulation which is used to hide the state of a structured data object inside a class, preventing unauthorized direct access to them
Achieve immutability by declaring the fields as private and using only getters
Getters and setters also allow additional functionalities like validation, error handling that could be added more easily in the future. Thus we can add conditional logic and provide behavior according to the needs
We can provide different access levels to the fields; for example, the get (read-access) may be public, while the set (write-access) could be protected
Control over setting the value of the property correctly
With getters and setters, we achieve one more key principle of OOP, i.e., abstraction, which is hiding implementation details so that no one can use the fields directly in other classes or modules
 * 
 */