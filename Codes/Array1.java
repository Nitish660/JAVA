package Codes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Java program to show how to remove element from Array in Java.
 */
public class Array1 {
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

        System.out.println("Enter the index of the element to remove ");
        int indexRemove = scanner.nextInt();

        arr = removeElement(arr, indexRemove);

        System.out.println("Array after removing the element at index " + indexRemove + ": " + Arrays.toString(arr));

        scanner.close();
    }

    private static int[] removeElement(int[] arr, int indexRemove) {
        if (indexRemove < 0 || indexRemove >= arr.length) {
            throw new IllegalArgumentException("Index out of range");
        }

        int[] newArray = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != indexRemove) {
                newArray[j++] = arr[i];
            }
        }

        return newArray;
    }
}
