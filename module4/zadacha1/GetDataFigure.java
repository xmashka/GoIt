package module4.zadacha1;

import java.util.Scanner;

public class GetDataFigure {

    GetDataFigure(int typeFigure) {
        if (typeFigure == 1) {
            System.out.println("Input height lenght of triangle ");
            Scanner h = new Scanner(System.in);
            System.out.println("Input length of the sides of triangle ");
            Scanner a = new Scanner(System.in);
            CalculateDataFigure triangleMore = new CalculateDataFigure(typeFigure, a.nextInt(), h.nextInt());
        }
            else if (typeFigure == 2) {
                    System.out.println("Input lenght of rectangle side B ");
                    Scanner b = new Scanner(System.in);
                    System.out.println("Input length of rectangle side C ");
                    Scanner c = new Scanner(System.in);
                    CalculateDataFigure rectangleMore = new CalculateDataFigure(typeFigure, c.nextInt(), b.nextInt());
                }
            else if (typeFigure == 3) {
                    System.out.println("Input radius of circle ");
                    Scanner r = new Scanner(System.in);
                    CalculateDataFigure circleMore = new CalculateDataFigure (r.nextInt());
            }
        }

    }

