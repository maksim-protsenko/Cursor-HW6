import java.util.Iterator;
import java.util.*;

public class TreeSetTasks {
    public static void main(String[] args) {

        // Task 1.
        System.out.println("1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set. ");
        Set<String> firstTreeSet = new TreeSet<>();
        firstTreeSet.add("Red");
        firstTreeSet.add("Green");
        firstTreeSet.add("Blue");
        firstTreeSet.add("Cyan");
        firstTreeSet.add("Magenta");
        firstTreeSet.add("Yellow");
        firstTreeSet.add("Black");
        System.out.println("My tree set: " + firstTreeSet + "\n");

        // Task 2.
        System.out.println("2. Write a Java program to iterate through all elements in a tree set.");
        System.out.print("My tree set: ");
        for (String value : firstTreeSet) {
            System.out.print(value + " ");
        }

        // Task 3.
        System.out.println("\n\n3. Write a Java program to add all the elements of a specified tree set to another tree set.");
        Set<String> secondTreeSet = new TreeSet<>();
        secondTreeSet.add("Red");
        secondTreeSet.add("White");
        secondTreeSet.add("Silver");
        secondTreeSet.add("Cyan");
        System.out.println("First tree set: " + firstTreeSet);
        System.out.println("Second tree set: " + secondTreeSet);
        firstTreeSet.addAll(secondTreeSet);
        System.out.println("After adding: " + firstTreeSet + "\n");

        // Task 4.
        System.out.println("4. Write a Java program to create a reverse order view of the elements contained in a given tree set.");
        System.out.println("My tree set: " + firstTreeSet);
        Iterator iterator = ((TreeSet<String>) firstTreeSet).descendingIterator();
        System.out.print("Elements in reverse order: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Task 5.
        System.out.println("\n\n5. Write a Java program to get the first and last elements in a tree set.");
        System.out.println("My tree set: " + firstTreeSet);
        String firstElement = ((TreeSet<String>) firstTreeSet).first();
        System.out.println("First element of tree set: " + firstElement);
        String lastElement = ((TreeSet<String>) firstTreeSet).last();
        System.out.println("Last element of tree set: " + lastElement + "\n");

        // Task 6.
        System.out.println("6. Write a Java program to clone a tree set list to another tree set.");
        System.out.println("My tree set: " + firstTreeSet);
        Set<String> clonedTreeSet = new TreeSet<>(firstTreeSet);
        System.out.println("Cloned TreeSet = " + clonedTreeSet + "\n");

        // Task 7.
        System.out.println("7. Write a Java program to get the number of elements in a tree set.");
        System.out.println("My tree set: " + firstTreeSet);
        int numberOfElements = firstTreeSet.size();
        System.out.println("Number of elements in a tree set: " + numberOfElements + "\n");

        // Task 8.
        System.out.println("8. Write a Java program to compare two tree sets.");
        System.out.println("First tree set: " + firstTreeSet);
        System.out.println("Second tree set: " + secondTreeSet);
        for (String value : firstTreeSet) {
            if (secondTreeSet.contains(value)) {
                System.out.println(value + " is existed in the second array");
            } else {
                System.out.println(value + " isn`t existed in the second array");
            }
        }

        // Task 9.
        System.out.println("\n9. Write a Java program to find the numbers less than 7 in a tree set.");
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        numbers.add(17);
        numbers.add(25);
        numbers.add(32);
        System.out.println("Tree with integers " + numbers);
        Set<Integer> numbersLessThanSeven = ((TreeSet<Integer>) numbers).headSet(7);
        System.out.println("Numbers less than 7: " + numbersLessThanSeven + "\n");

        // Task 10.
        System.out.println("10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.");
        System.out.println("Tree with integers " + numbers);
        Integer givenElement = 10;
        Integer numbersBiggerOrEqual = ((TreeSet<Integer>) numbers).floor(10);
        System.out.println("Given number: " + givenElement);
        System.out.println("Numbers are greater than or equal to the given element: " + numbersBiggerOrEqual + "\n");

        // Task 11.
        System.out.println("11. Write a Java program to get the element in a tree set which is less than or equal to the given element.");
        System.out.println("Tree with integers " + numbers);
        Integer givenSecondElement = 25;
        System.out.println("Less than or equal to " + givenSecondElement + " : " + ((TreeSet<Integer>) numbers).floor(givenSecondElement) + "\n");

        // Task 12.
        System.out.println("12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.");
        System.out.println("Tree with integers " + numbers);
        System.out.println("Greater than 10 " + ((TreeSet<Integer>) numbers).higher(10) + "\n");

        // Task 13.
        System.out.println("13. Write a Java program to get an element in a tree set which is strictly less than the given element.");
        System.out.println("Tree with integers " + numbers);
        System.out.println("Greater than 10 " + ((TreeSet<Integer>) numbers).lower(10) + "\n");

        // Task 14.
        System.out.println("14. Write a Java program to retrieve and remove the first element of a tree set.");
        System.out.println("Tree with integers " + numbers);
        System.out.println("Removing the first element: " + ((TreeSet<Integer>) numbers).pollFirst());
        System.out.println("Tree with integers after removing" + numbers + "\n");

        // Task 15.
        System.out.println("15. Write a Java program to retrieve and remove the last element of a tree set.");
        System.out.println("Tree with integers " + numbers);
        System.out.println("Removing the last element: " + ((TreeSet<Integer>) numbers).pollLast());
        System.out.println("Tree with integers after removing" + numbers + "\n");

        // Task 16.
        System.out.println("16. Write a Java program to remove a given element from a tree set.");
        System.out.println("Tree with integers " + numbers);
        System.out.println("Removing the element 10");
        numbers.remove(10);
        System.out.println("Tree with integers after removing" + numbers + "\n");
    }
}
