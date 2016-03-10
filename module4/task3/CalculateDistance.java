package module4.task3;

import java.util.Scanner;

public class CalculateDistance {
    public static void main (String[] args){
        double d;
        PointXY point1 = new PointXY();
        point1.getData();
        PointXY point2 = new PointXY();
        point2.getData();
        d = Math.sqrt(Math.pow((point2.getX() - point1.getX()),2) + Math.pow((point2.getY() - point1.getY()),2));
        System.out.println("The distance between points A and B is " + d);
    }
}
