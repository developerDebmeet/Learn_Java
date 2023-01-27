import java.util.*;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class MoreDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(15);
        nums.add(53);
        nums.add(15);
        nums.add(566);
        nums.add(105);
        nums.add(351);

        Collections.sort(nums); // normal asc sort
        System.out.println(nums);

        // We need to specifty <Integer> here in right side also, due to anonymous class
        Comparator<Integer> comparator = new Comparator<Integer>() {
            // A comparator to sort on the last digit of a number
            // 1 to swap, -1 to retain
            public int compare(Integer i, Integer j) {
                return (i%10<j%10)? -1:1;
            }
        };

        Collections.sort(nums,comparator);
        System.out.println(nums);

///////////////////////////////////////////////////////////////////////
// Comparator is also Functional Interface, hence can use lambda to shorten.
        Comparator<Student> com = (i,j) -> {
            if(i.age > j.age) {
                return 1;
            } else {
                return -1;
            }
        };

        // Sorting Classes
        // Sorting Students based on age
        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Debmeet"));
        students.add(new Student(11, "Shalini"));
        students.add(new Student(66, "Vijay"));

        Collections.sort(students, com);
        System.out.println(students);

        // Another way is to extend Comparable in Students
        // override the compareTo method and add the same logic of com Comparator there
        // then directly call sort(students), without any need of comparator now

    }    
}
