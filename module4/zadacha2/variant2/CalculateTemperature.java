package module4.zadacha2.variant2;

import java.util.Scanner;

public class CalculateTemperature {

    public static void main(String[] args) {
        System.out.println("Choose original measuring 1-Celsius, 2-Fahrenheit ");
        Scanner tm = new Scanner(System.in);
        switch (tm.nextInt()) {
            case 1:
                System.out.println("Input Celsius temperature  ");
                Scanner c = new Scanner(System.in);
                Celsius2Fahrenheit MeasurCelsius = new Celsius2Fahrenheit(c.nextInt());
                break;
            case 2:
                System.out.println("Input Fahrenheit temperature  ");
                Scanner f = new Scanner(System.in);
                Fahrenheit2Celsius MeasurFahrenheit = new Fahrenheit2Celsius(f.nextInt());
                break;
        }
    }
}