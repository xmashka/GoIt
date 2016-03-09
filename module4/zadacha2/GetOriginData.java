package module4.zadacha2;

import java.util.Scanner;

public class GetOriginData {
    public static int GetData (String typeMeasure){
        System.out.println("Input " + typeMeasure + " temperature  ");
        Scanner od = new Scanner(System.in);
        return od.nextInt();
    }

}
