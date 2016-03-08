package module4.zadacha1;

import java.util.Scanner;

public class TriangleMore implements Action4Calc {
    int h;
    int a;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void getData() {
        System.out.println("Input height lenght of triangle ");
        Scanner h = new Scanner(System.in);
        this.setH(h.nextInt());
        System.out.println("Input length of the sides of triangle ");
        Scanner a = new Scanner(System.in);
        this.setA(a.nextInt());
    }

    public void calculateData() {
        double area;
        area = a*h/2;
        System.out.println("Area is " + area);
    }
}
