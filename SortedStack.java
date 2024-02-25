/** Marven Noa
 * Spring A
 * Software Design and Documentation
 * Week 5 Module 5
 * Sorted Stack
 */

import java.util.Collections;
import java.util.Stack; //Imported Stack from Collections
import java.util.List;
import java.util.Scanner;

/** We are going from a LinkedList to a Stack.
 * The LinkedList in Java is a doubly Linked List
 * The Stack follows Last in, First out (LIFO)
 * The new implementation will not greatly affect the elements,
 * It will change the order of the elements
 */
public class SortedStack {

    public static void main(String[] args) {
        /** We are using the Stack Data structure from Collections
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

        System.out.println("Stack was used to store " +
                "the integers provided by the user and Collections.sort " +
                "was used to sort the integers in ascending order");
        System.out.println("The size of this Stack is: " + numbers.size());


    }

    /** The list is created and the integers are read until the user decides to type a non-integer + Press ENTER
     *
     * @param sc This is used to read the users input
     * @return What is returned is a Stack with the integers the user provided instead of a Linked List.\
     */

    private static Stack<Integer> readIntegers(Scanner sc) {
        Stack<Integer> numbers = new Stack<>();
        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            /** Push() in a Stack,
             * whereas add() is done in a LinkedList
             */
            numbers.push(num);

        }
        return numbers;
    }

}
