package module4.zadacha2;

import java.util.Scanner;

public class CalculateTemperature {

    public static void main(String[] args) {
        System.out.println("Choose original measuring 1-Celsius, 2-Fahrenheit ");
        Scanner tm = new Scanner(System.in);
        GetOriginData data = new GetOriginData();
        switch (tm.nextInt()) {
            case 1:
                Celsius2Fahrenheit MeasurCelsius = new Celsius2Fahrenheit(data.GetData("Celsius"));
                break;
            case 2:
                Fahrenheit2Celsius MeasurFahrenheit = new Fahrenheit2Celsius(data.GetData("Fahrenheit"));
                break;
        }
    }
}