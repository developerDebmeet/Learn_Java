import java.util.ArrayList;
import java.util.Collection; // java util imports!
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        // only left side<Integer> needs to be populated. we can keep the right one like <>
        Collection<Integer> nums = new ArrayList<Integer>(); // <> -> Generics: Can be used for any Class.
        nums.add(6);
        nums.add(9);
        for(int n : nums) {
            System.out.println(n);
        }      

        List<Integer> nums2 = new ArrayList<Integer>(); // <> -> Generics: Can be used for any Class.
        nums2.add(6);
        nums2.add(9);
        System.out.println(nums2.get(0)); // Using list since it supports get() etc, more specialized for this functionality than the generic Collections
        System.out.println(nums2.indexOf(9));
        System.out.println(nums2.indexOf(69));
        for(int n : nums2) {
            System.out.println(n);
        }   

        Set<Integer> set = new HashSet<Integer>(); // Unique Values. But the values may get shuffled and there is no index values
        set.add(1000);
        set.add(3);
        set.add(5);
        set.add(3);
        set.add(3);
        for(int n : set) {
            System.out.println(n);
        }

        Set<Integer> treeSet = new TreeSet<Integer>(); // Unique and Sorted Values.
        treeSet.add(1000);
        treeSet.add(0);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(3);
        for(int n : treeSet) {
            System.out.println(n);
        }

        Iterator<Integer> values =  treeSet.iterator(); // Works with all collections as all are iterable
        while(values.hasNext()) {
            System.out.println(values.next());
        }


        // Map is similar to Above, but not exactly part of Collection
        // This also does not have any sequence, like Set
        // We can use HashTable instead of HashMap as well. HashTable is Synchronized
        Map<String,Integer> map = new HashMap<>();
        map.put("",0);
        map.put("Debmeet",100);
        map.put("Sarika",90);
        map.put("Sushmita",60);
        map.put("Sarika", 69); // This will be new value, overwritten

        System.out.println(map);
        System.out.println(map.get("Debmeet"));
        System.out.println(map.keySet());

        for(String name : map.keySet()) {
            System.out.println(name + " " + map.get(name));
        }


    }    
}
/*
 * Iterable Interface
 *           V [extends]
 * Collection Interface
 *           V [extends] 
 * List, Queue, Set Interface
 *           V [implements]
 * ArrayList, LinkedList, DeQueue, HashSet etc [Classes]
 * 
 */