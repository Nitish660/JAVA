package Codes;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;


public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of the array");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        arr = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));

        scanner.close();
    }

    private static int[] removeDuplicates(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] result  = new int[set.size()];
        int i =0;
        for(int num : set){
            result[i++] = num;
        }
        return result;

    }

}
