package module4.task2;

import java.util.Scanner;

public class CalculateTemperature {

    public static void main(String[] args) {
        System.out.println("Choose original measuring 1-Celsius, 2-Fahrenheit ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Input Celsius temperature  ");
                Scanner scannerOriginTemperatureCelsius = new Scanner(System.in);
                Celsius2Fahrenheit MeasurCelsius = new Celsius2Fahrenheit();
                MeasurCelsius.Celsius2FahrenheitCalculate("Celsius", scannerOriginTemperatureCelsius.nextInt());
                break;
            case 2:
                System.out.println("Input Fahrenheit temperature  ");
                Scanner scannerOriginTemperatureFahrenheit = new Scanner(System.in);
                Fahrenheit2Celsius MeasurFahrenheit = new Fahrenheit2Celsius();
                MeasurFahrenheit.Fahrenheit2CelsiusCalculate("Fahrenheit", scannerOriginTemperatureFahrenheit.nextInt());
                break;
        }
    }

}