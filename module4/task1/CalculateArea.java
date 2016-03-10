package module4.task1;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args){
        System.out.println("Input type of figure 1-triangle 2-rectangle 3-circle ");
        Scanner scanner = new Scanner(System.in);
        GetDataFigure newFigure = new GetDataFigure(scanner.nextInt());
    }


}
