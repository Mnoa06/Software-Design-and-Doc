/**
 * Marven Noa
 * 2/10/24
 * Software Design and Documentation
 * I am importing Linkedlist and list from the Collections framework
 * in order create a linked list and sort the list ascending order
 * import Scanner to read the users input.
 */

import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The program is intended to read a list of integers from the user
 * and storing them in a LinkedList and sorting them in ascending order
 * I will be using JJava collections to do this
 */

public class SortedLinkedList {

        public static void main(String[] args) {
            /**
             *
             * Scanner is used
             * Scanner is a datatype
             * Create a scanner for users input
             */

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter an integer: ");
            System.out.println("Press any non-integer + Enter to end list:");
            //Reads the users input
            List<Integer> numbers = readIntegers(sc);

            Collections.sort(numbers);

            System.out.println("Sorted List: " + numbers);

            /**
             * Scanner closed to prevent leakage
             */

            sc.close();

            System.out.println("LinkedList was used to store " +
                    "the integers provided by the user and Collections.sort " +
                    "was used to sort the integers in ascending order");
            System.out.println("The size of this LinkedList is: " + numbers.size());


        }

    /** The list is created and the integers are read until the user decides to type a non-integer + Press ENTER
     *
     * @param sc This is used to read the users input
     * @return What is returned is a linked list with the integers the user provided.\
     */

    private static List<Integer> readIntegers(Scanner sc) {
            List<Integer> numbers = new LinkedList<>();
            while(sc.hasNextInt()) {
                int num = sc.nextInt();
                numbers.add(num);
            }
            return numbers;
        }

    }