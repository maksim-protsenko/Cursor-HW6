import java.util.*;

public class HashSetTasks {
    public static void main(String[] args) {

        // Task 1.
        System.out.println("1. Write a Java program to append the specified element to the end of a hash set. ");
        Set<String> firstSet = new HashSet<>();
        firstSet.add("Monday");
        firstSet.add("Tuesday");
        firstSet.add("Wednesday");
        firstSet.add("Thursday");
        firstSet.add("Friday");
        firstSet.add("Saturday");
        System.out.println("My hash set: " + firstSet + "\n");

        // Task 2.
        System.out.println("2. Write a Java program to iterate through all elements in a hash list.");
        Iterator<String> iterator = firstSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Task 3.
        System.out.println("3. Write a Java program to get the number of elements in a hash set.");
        int sizeOfSet = firstSet.size();
        System.out.println("Size of set is: " + sizeOfSet);

        // Task 4.
        System.out.println("4. Write a Java program to empty an hash set.");
        Set<String> secondSet = new HashSet<>();
        secondSet.add("Monday");
        secondSet.add("Tuesday");
        secondSet.add("Wednesday");
        secondSet.add("Thursday");
        secondSet.add("Friday");
        secondSet.add("Saturday");

        System.out.println("Original set: " + secondSet);
        secondSet.clear();
        System.out.println("After cleaning: " + secondSet + "\n");

        // Task 5.
        System.out.println("5. Write a Java program to test a hash set is empty or not.");
        System.out.println("Is " + firstSet + " empty? " + firstSet.isEmpty());
        System.out.println("Is " + secondSet + " empty? " + secondSet.isEmpty() + "\n");

        // Task 6.
        System.out.println("6. Write a Java program to clone a hash set to another hash set.");
        System.out.println("First hash set: " + firstSet);
        Set<String> clonedSet = new HashSet<>(firstSet);
        System.out.println("Cloned set: " + clonedSet + "\n");

        // Task 7.
        System.out.println("7. Write a Java program to convert a hash set to an array.");
        System.out.println("My hash set: " + firstSet);
        String[] arrayFromHashSet = new String[firstSet.size()];
        firstSet.toArray(arrayFromHashSet);
        System.out.print("Array: ");
        for (String value : arrayFromHashSet) {
            System.out.print(value + " ");
        }

        // Task 8.
        System.out.println("\n\n8. Write a Java program to convert a hash set to a tree set");
        Set<String> myTreeSet = new TreeSet<>(firstSet);
        System.out.print("My tree set: ");
        for (String value : myTreeSet) {
            System.out.print(value + " ");
        }

        // Task 9.
        System.out.println("\n\n9. Write a Java program to convert a hash set to a List/ArrayList.");
        List<String> myArrayList = new ArrayList<>(firstSet);
        System.out.println("My array list = " + myArrayList + "\n");

        // Task 10.
        System.out.println("10. Write a Java program to compare two hash set.");
        secondSet.add("Monday");
        secondSet.add("Tuesday");
        secondSet.add("Wednesday");
        secondSet.add("Thursday");
        secondSet.add("Friday");
        secondSet.add("Saturday");
        secondSet.add("Sunday");
        for (String value : secondSet) {
            if (firstSet.contains(value)) {
                System.out.println(value + " is existed in the second hash set");
            } else {
                System.out.println(value + " isn`t existed in the second hash set");
            }
        }

        // Task 11.
        System.out.println("\n11. Write a Java program to compare two sets and retain elements which are same on both sets.");
        System.out.println("My first hash set: " + firstSet);
        System.out.println("My second hash set: " + secondSet);
        firstSet.retainAll(secondSet);
        System.out.println(firstSet + "\n");

        // Task 12.
        System.out.println("12. Write a Java program to remove all of the elements from a hash set.");
        System.out.println("My hash set: " + secondSet);
        secondSet.clear();
        System.out.println("My hash set after cleaning: " + secondSet);


    }
}
