package module4.zadacha1;

import java.util.Scanner;

public class RectangleMore implements Action4Calc  {
    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void getData() {
        System.out.println("Input lenght of rectangle side A ");
        Scanner a = new Scanner(System.in);
        this.setA(a.nextInt());
        System.out.println("Input length of rectangle side B ");
        Scanner b = new Scanner(System.in);
        this.setB(b.nextInt());
    }

    public void calculateData() {
        double area;
        area = a*b;
        System.out.println("Area is " + area);
    }
}
