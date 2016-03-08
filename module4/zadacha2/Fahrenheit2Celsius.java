package module4.zadacha2;

import java.util.Scanner;

public class Fahrenheit2Celsius implements Action4Calc{
    double t;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public void getData() {
        System.out.println("Input Fahrenheit temperature ");
        Scanner t = new Scanner(System.in);
        this.setT(t.nextInt());
    }
    public void calculateData() {
        double t1;
        t1 = (t-32)*5/9;
        System.out.println("Celsius temperature is " + t1);
    }
}
