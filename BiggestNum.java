/**
 * The BiggestNum class finds the biggest number in an array of integers and prints it.
 */
public class BiggestNum{
    /**
     * The function finds the biggest number in an array of integers.
     * 
     * @param array An array of integers
     * @return The method is returning the biggest number in the given array.
     */
    public static int findBiggestNumber(int[] array) {
        int biggest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        return biggest;
    }

    // The `main` method is the entry point of the Java program. It is the method that is executed when
    // the program is run.
    public static void main(String[] args) {
        int[] numbers = {10,20,8,60,12};
        int biggestNumber = findBiggestNumber(numbers);
        
        if (biggestNumber != Integer.MIN_VALUE) {
            System.out.println("The biggest number in the array is: " + biggestNumber);
        }
    }
}
