import java.util.*;

public class ArrayListTasks {
    public static void main(String[] args) {

        // Task 1.
        System.out.println("1. Write a Java program to create a new array list, add some colors (string) and print out the collection.");
        List<String> listOfColours = new ArrayList<>();
        listOfColours.add("Magenta");
        listOfColours.add("Yellow");
        listOfColours.add("Black");
        listOfColours.add("Red");
        listOfColours.add("Blue");
        listOfColours.add("Blue");
        System.out.println("List of colours which was added to array list: " + listOfColours + "\n");

        // Task 2.
        System.out.println("2. Write a Java program to iterate through all elements in a array list.");
        System.out.print("Iterating was made by foreach: ");
        for (String color : listOfColours) {
            System.out.print(color + " ");
        }
        System.out.println("\n");

        // Task 3.
        System.out.println("3. Write a Java program to insert an element into the array list at the first position.");
        listOfColours.add(0, "Cyan");
        System.out.println("Color was added at the first position: " + listOfColours + "\n");

        // Task 4.
        System.out.println("4. Write a Java program to retrieve an element (at a specified index) from a given array list.");
        System.out.println("5th color is: " + listOfColours.get(4) + "\n");

        // Task 5.
        System.out.println("5. Write a Java program to update specific array element by given element.");
        listOfColours.set(5, "Green");
        System.out.println(listOfColours + "\n");

        // Task 6.
        System.out.println("6. Write a Java program to remove the third element from a array list.");
        listOfColours.remove(2);
        System.out.println(listOfColours + "\n");

        // Task 7.
        System.out.println("7. Write a Java program to search an element in a array list.");
        if (listOfColours.contains("Green")) {
            System.out.println("Green colour was found\n");
        } else {
            System.out.println("There is no Green colour in array\n");
        }

        // Task 8.
        System.out.println("8. Write a Java program to sort a given array list.");
        System.out.println("List of colours before sorting:");
        for (String color : listOfColours) {
            System.out.print(color + " ");
        }
        Collections.sort(listOfColours);
        System.out.println("\nList of colours after sorting:");
        for (String color : listOfColours) {
            System.out.print(color + " ");
        }

        // Task 9.
        System.out.println("\n\n9. Write a Java program to copy one array list into another.");
        System.out.print("First array: ");
        for (String color : listOfColours) {
            System.out.print(color + " ");
        }
        List<String> secondList = new ArrayList<>();
        secondList.add("Navy");
        secondList.add("Pink");
        secondList.add("Obsidian black");
        secondList.add("Purple");
        secondList.add("White");
        secondList.add("Brown");

        System.out.print("\nSecond array: ");
        for (String color : secondList) {
            System.out.print(color + " ");
        }
        Collections.copy(secondList, listOfColours);
        System.out.print("\n\nFirst array after copy: " + listOfColours);
        System.out.println("\nSecond array after copy: " + secondList + "\n");

        // Task 10.
        System.out.println("10. Write a Java program to shuffle elements in a array list.");
        System.out.println("Array before shuffle: " + listOfColours);
        Collections.shuffle(listOfColours);
        System.out.println("Array after shuffle: " + listOfColours + "\n");

        // Task 11.
        System.out.println("11. Write a Java program to reverse elements in a array list.");
        System.out.println("Array before reversing: " + listOfColours);
        Collections.reverse(listOfColours);
        System.out.println("Array after reversing: " + listOfColours + "\n");

        // Task 12.
        System.out.println("12. Write a Java program to extract a portion of a array list");
        System.out.println("Array of colours: " + listOfColours);
        List<String> subListOfColours = listOfColours.subList(1, 4);
        System.out.println("Portion colours of a array list " + subListOfColours + "\n");

        // Task 13.
        System.out.println("13. Write a Java program to compare two array lists.");
        System.out.println("First array: " + listOfColours);
        secondList.clear();
        secondList.add("Navy");
        secondList.add("Pink");
        secondList.add("Blue");
        secondList.add("Obsidian black");
        secondList.add("Purple");
        secondList.add("Black");
        secondList.add("Red");
        System.out.println("Second array: " + secondList);
        for (String color : secondList) {
            if (listOfColours.contains(color)) {
                System.out.println(color + " is existed in the first array");
            } else {
                System.out.println(color + " isn`t existed in the first array");
            }
        }

        // Task 14.
        System.out.println("\n14. Write a Java program of swap two elements in an array list.");
        System.out.println("Array of colours before swapping elements: " + listOfColours);
        int firstIndex = 1;
        int secondIndex = 5;
        Collections.swap(listOfColours, firstIndex, secondIndex);
        System.out.println("Array of colours after swapping " + firstIndex + "-element to " + secondIndex + "-element: " + listOfColours + "\n");

        // Task 15.
        System.out.println("15. Write a Java program to join two array lists");
        System.out.println("First array: " + listOfColours);
        System.out.println("Second array: " + secondList);
        List<String> fullListOfColours = new ArrayList<>();
        fullListOfColours.addAll(listOfColours);
        fullListOfColours.addAll(secondList);
        System.out.println("Big list of colours: " + fullListOfColours + "\n");

        // Task 16.
        System.out.println("16. Write a Java program to clone an array list to another array list.");
        System.out.println("First array of colours: " + listOfColours);
        List<String> clonedList = new ArrayList<>(listOfColours);
        System.out.println("Cloned list: " + clonedList + "\n");

        // Task 17.
        System.out.println("17. Write a Java program to empty an array list.");
        System.out.println("Array before clearing: " + clonedList);
        clonedList.clear();
        System.out.println("Array after clearing: " + clonedList + "\n");

        // Task 18.
        System.out.println("18. Write a Java program to test an array list is empty or not.");
        if (clonedList.isEmpty()) {
            System.out.println("Array list " + clonedList + "is empty");
        } else {
            System.out.println("Array list " + clonedList + "isn`t empty");
        }
        clonedList.add("Black");
        clonedList.add("Silver");
        if (clonedList.isEmpty()) {
            System.out.println("Array list " + clonedList + "is empty" + "\n");
        } else {
            System.out.println("Array list " + clonedList + "isn`t empty" + "\n");
        }

        // Task 19.
        System.out.println("19. Write a Java program to trim the capacity of an array list the current list size.");
        System.out.println("Original array: " + secondList);
        ((ArrayList<String>) secondList).trimToSize();
        System.out.println("Array after trimming: " + secondList + "\n");

        // Task 20.
        System.out.println("20. Write a Java program to increase the size of an array list.");
        System.out.println("Original array: " + secondList);
        ((ArrayList<String>) secondList).ensureCapacity(10);
        secondList.add("White");
        secondList.add("Snow white");
        secondList.add("Gold");
        secondList.add("Beige");
        System.out.println(secondList + "\n");

        // Task 21.
        System.out.println("21. Write a Java program to replace the second element of a ArrayList with the specified element.");
        System.out.println("Original array: " + secondList);
        secondList.set(1, "Red");
        System.out.println("Array with replaced 2nd element:" + secondList + "\n");

        // Task 22.
        System.out.println("22. Write a Java program to print all the elements of a ArrayList using the position of the elements.");
        for (int i = 0; i < secondList.size(); i++) {
            System.out.print(secondList.get(i) + "  ");
        }
    }
}
