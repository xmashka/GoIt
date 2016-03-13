package module5;


import java.util.Scanner;

public class ArrayCreation {
    public static int[] arrayCreat(int numberElements){
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[numberElements];
        for (int i = 0; i < numberElements; i++) {
            System.out.println("Input array elements ");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
        }
}