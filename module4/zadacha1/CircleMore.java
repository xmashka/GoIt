package module4.zadacha1;

import java.util.Scanner;

public class CircleMore implements Action4Calc {
    int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void getData() {
        System.out.println("Input radius of circle ");
        Scanner r = new Scanner(System.in);
        this.setR(r.nextInt());
    }

    public void calculateData() {
        double area;
        area = 3.14*r*r;
        System.out.println("Area is " + area);
    }
}
