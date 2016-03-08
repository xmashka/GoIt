package module4.zadacha2;

import java.util.Scanner;

public class Celsius2Fahrenheit implements Action4Calc {
    double t;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public void getData() {
        System.out.println("Input Celsius temperature ");
        Scanner t = new Scanner(System.in);
        this.setT(t.nextInt());
    }
    public void calculateData() {
        double t1;
        t1 = t*9/5+32 ;
        System.out.println("Fahrenheit temperature is " + t1);
    }
}
