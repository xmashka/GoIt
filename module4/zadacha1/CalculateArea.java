package module4.zadacha1;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args){
        System.out.println("Input type of figure 1-triangle 2-rectangle 3-circle ");
        Scanner dd = new Scanner(System.in);
        int d;
        d = dd.nextInt();
        if (1 == d) {
            TriangleMore figure = new TriangleMore();
            figure.getData();
            figure.calculateData();
        }
        else if (2 == d)
        {
           RectangleMore figure = new RectangleMore();
            figure.getData();
            figure.calculateData();
        }
        else if (3 == d)
        {
            CircleMore figure = new CircleMore();
            figure.getData();
            figure.calculateData();
        }

//*x        figure.getData();
//*x        figure.calculateData();


    }
}
