package module4.task1;

import java.util.Scanner;

public class GetDataFigure {
    double area;
    GetDataFigure(int typeFigure) {
        if (typeFigure == 1) {
            CalculateDataFigure triangleMore = new CalculateDataFigure();
            System.out.println("Input height lenght of triangle ");
            Scanner scannerH = new Scanner(System.in);
            System.out.println("Input length of the sides of triangle ");
            Scanner scannerA = new Scanner(System.in);
            area = triangleMore.CalculateDataTriangle(scannerA.nextInt(), scannerH.nextInt());
            System.out.println("Area is " + area);

        }
        if (typeFigure == 2) {
                    CalculateDataFigure rectangleMore = new CalculateDataFigure();
                    System.out.println("Input lenght of rectangle side B ");
                    Scanner scannerB = new Scanner(System.in);
                    System.out.println("Input length of rectangle side C ");
                    Scanner scannerC = new Scanner(System.in);
                    area = rectangleMore.CalculateDataRectangle(scannerC.nextInt(), scannerB.nextInt());
                    System.out.println("Area is " + area);
        }
        if (typeFigure == 3) {
                    CalculateDataFigure circleMore = new CalculateDataFigure();
                    System.out.println("Input radius of circle ");
                    Scanner scannerR = new Scanner(System.in);
                    area = circleMore.CalculateDataCircle(scannerR.nextInt());
                    System.out.println("Area is " + area);
            }
        }

    }

