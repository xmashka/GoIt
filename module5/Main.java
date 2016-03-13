package module5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input number of array elements ");
        Scanner scanner = new Scanner(System.in);
        int[] arrayInt = ArrayCreation.arrayCreat(scanner.nextInt());
        System.out.println("Choose operation: 1 - Min&Max elements, 2 - Sort Ascending ");
        switch (scanner.nextInt()) {
            case 1:
                MinMaxElement minMaxElement = new MinMaxElement();
                minMaxElement.minmax(arrayInt);
                break;
            case 2:
                SortAscending sortArray = new SortAscending();
                sortArray.sorting(arrayInt);
                break;
            default:
                System.out.println("By");
        }
    }
}
