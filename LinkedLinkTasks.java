import java.util.*;

public class LinkedLinkTasks {
    public static void main(String[] args) {

        // Task 1.
        System.out.println("1. Write a Java program to append the specified element to the end of a linked list.");
        List<String> colours = new LinkedList<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Cyan");
        colours.add("Magenta");
        colours.add("Yellow");
        colours.add("Black");
        System.out.println("My linked list " + colours + "\n");

        // Task 2.
        System.out.println("2. Write a Java program to iterate through all elements in a linked list.");
        System.out.println("My linked list: " + colours);
        System.out.print("Print elements by forech: ");
        for (String value : colours) {
            System.out.print(value + " ");
        }

        // Task 3.
        System.out.println("3. Write a Java program to iterate through all elements in a linked list starting at the specified position.");
        int position = 2;
        Iterator iterator = colours.listIterator(position);
        System.out.print("Starting from " + (position + 1) + "-element: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Task 4.
        System.out.println("\n\n4. Write a Java program to iterate a linked list in reverse order.");
        System.out.println("My linked list: " + colours);
        Iterator secondIterator = ((LinkedList<String>) colours).descendingIterator();
        System.out.print("Linked list in reverse order: ");
        while (secondIterator.hasNext()) {
            System.out.print(secondIterator.next() + " ");
        }

        // Task 5.
        System.out.println("\n\n5. Write a Java program to insert the specified element at the specified position in the linked list.");
        System.out.println("My linked list: " + colours);
        colours.add(7, "Silver");
        System.out.println("Updated linked list: " + colours + "\n");

        // Task 6.
        System.out.println("6. Write a Java program to insert elements into the linked list at the first and last position.");
        System.out.println("My linked list: " + colours);
        ((LinkedList<String>) colours).addFirst("White");
        ((LinkedList<String>) colours).addLast("Gold");
        System.out.println("Updated linked list: " + colours + "\n");

        // Task 7.
        System.out.println("7. Write a Java program to insert the specified element at the front of a linked list.");
        System.out.println("My linked list: " + colours);
        ((LinkedList<String>) colours).offerFirst("Purple");
        System.out.println("Updated linked list: " + colours + "\n");

        // Task 8.
        System.out.println("8. Write a Java program to insert the specified element at the end of a linked list.");
        System.out.println("My linked list: " + colours);
        ((LinkedList<String>) colours).offerLast("Velvet");
        System.out.println("Updated linked list: " + colours + "\n");

        // Task 9.
        System.out.println("9. Write a Java program to insert some elements at the specified position into a linked list.");
        System.out.println("My linked list: " + colours);
        List<String> smallList = new LinkedList<>();
        smallList.add("Beige");
        smallList.add("Navy");
        colours.addAll(10, smallList);
        System.out.println("Updated linked list: " + colours + "\n");

        // Task 10.
        System.out.println("10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.");
        System.out.println("My linked list: " + colours);
        String firstElement = ((LinkedList<String>) colours).getFirst();
        System.out.println("First element: " + firstElement);
        String lastElement = ((LinkedList<String>) colours).getLast();
        System.out.println("Last element: " + lastElement);

        // Task 11.
        System.out.println("11. Write a Java program to display the elements and their positions in a linked list.");
        System.out.println("My linked list: " + colours);
        for (int i = 0; i < colours.size(); i++) {
            System.out.println("Position of " + colours.get(i) + " in linked list is " + i);
        }

        // Task 12.
        System.out.println("\n12. Write a Java program to remove a specified element from a linked list.");
        System.out.println("My linked list: " + colours);
        colours.remove(0);
        System.out.println("Updated linked list after removing first element: " + colours + "\n");

        // Task 13.
        System.out.println("13. Write a Java program to remove first and last element from a linked list.");
        System.out.println("My linked list: " + colours);
        ((LinkedList<String>) colours).removeFirst();
        ((LinkedList<String>) colours).removeLast();
        System.out.println("Updated linked list after removing first and last elements: " + colours + "\n");

        // Task 14.
        System.out.println("14. Write a Java program to remove all the elements from a linked list.");
        List<String> clonedList = new LinkedList<>(colours);
        System.out.println("My linked list: " + clonedList);
        clonedList.clear();
        System.out.println("Updated linked list after removing all elements: " + clonedList + "\n");

        // Task 15.
        System.out.println("15. Write a Java program of swap two elements in an linked list.");
        System.out.println("My linked list: " + colours);
        Collections.swap(colours, 8, 10);
        System.out.println("Updated linked list after swapping 8th and 10th elements: " + colours + "\n");

        // Task 16.
        System.out.println("16. Write a Java program to shuffle the elements in a linked list.");
        List<String> secondList = new LinkedList<>(colours);
        System.out.println("My linked list: " + secondList);
        Collections.shuffle(secondList);
        System.out.println("Updated linked list after shuffling: " + secondList + "\n");


        // Task 17.
        System.out.println("17. Write a Java program to join two linked lists.");
        System.out.println("First list: " + colours);
        System.out.println("First list: " + smallList);
        List<String> hugeList = new LinkedList<>();
        hugeList.addAll(colours);
        hugeList.addAll(smallList);
        System.out.println("Updated linked list after joining two linked lists " + hugeList + "\n");

        // Task 18.
        System.out.println("18. Write a Java program to clone an linked list to another linked list.");
        System.out.println("My linked list: " + colours);
        clonedList = new LinkedList<>(colours);
        System.out.println("Cloned list " + clonedList + "\n");

        // Task 19.
        System.out.println("19. Write a Java program to remove and return the first element of a linked list.");
        System.out.println("My linked list: " + clonedList);
        System.out.println("Updated linked list after removing " + ((LinkedList<String>) clonedList).pop() + ": " + clonedList + "\n");

        // Task 20.
        System.out.println("20. Write a Java program to retrieve but does not remove, the first element of a linked list.");
        System.out.println("My linked list: " + colours);
        firstElement = ((LinkedList<String>) colours).peekFirst();
        System.out.println("First element: " + firstElement);
        System.out.println("Linked list: " + colours + "\n");

        // Task 21.
        System.out.println("21. Write a Java program to retrieve but does not remove, the last element of a linked list.");
        System.out.println("My linked list: " + colours);
        lastElement = ((LinkedList<String>) colours).peekLast();
        System.out.println("Last element: " + lastElement);
        System.out.println("Linked list: " + colours + "\n");

        // Task 22.
        System.out.println("22. Write a Java program to check if a particular element exists in a linked list.");
        System.out.println("My linked list: " + colours);
        String firstColour = "Golden";
        String secondColour = "Blue";
        if (colours.contains(firstColour)) {
            System.out.println("Colour " + firstColour + " is present in linked list");
        } else {
            System.out.println("Colour " + firstColour + " isn`t present in linked list");
        }
        if (colours.contains(secondColour)) {
            System.out.println("Colour " + secondColour + " is present in linked list");
        } else {
            System.out.println("Colour " + secondColour + " isn`t present in linked list");
        }

        // Task 23.
        System.out.println("\n23. Write a Java program to convert a linked list to array list.");
        System.out.println("My linked list: " + colours);
        List<String> myArralist = new ArrayList<>(colours);
        System.out.println("Arralist: " + myArralist + "\n");

        // Task 24.
        System.out.println("24. Write a Java program to compare two linked lists.");
        System.out.println("My first list: " + colours);
        System.out.println("My second list: " + clonedList);
        hugeList.clear();
        for (String value : colours) {
            if (clonedList.contains(value)) {
                hugeList.add(value);
            } else {
                System.out.println(value + " isn`t contains");
            }
        }
        System.out.println("The same elements are " + hugeList + "\n");

        // Task 25.
        System.out.println("25. Write a Java program to test an linked list is empty or not. ");
        System.out.println("My first list: " + colours);
        clonedList.clear();
        System.out.println("My second list: " + clonedList);
        System.out.println("My first list is empty? " + colours.isEmpty());
        System.out.println("My second list is empty? " + clonedList.isEmpty() + "\n");

        // Task 26.
        System.out.println("26. Write a Java program to replace an element in a linked list.");
        System.out.println("My linked list: " + colours);
        colours.set(10,"Purple");
        System.out.println("Updated linked list after replacing an element: " + colours + "\n");
    }
}
