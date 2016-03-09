package module4.zadacha2;

import java.util.Scanner;

public class CalculateTemperature {

    public static void main(String[] args) {
        System.out.println("Choose original measuring 1-Celsius, 2-Fahrenheit ");
        Scanner tm = new Scanner(System.in);
        switch (tm.nextInt()) {
            case 1:
                GetOriginData DataCelsius = new GetOriginData();
                Celsius2Fahrenheit MeasurCelsius = new Celsius2Fahrenheit(GetOriginData.GetData("Celsius"));
                break;
            case 2:
               GetOriginData DataFahrenheit = new GetOriginData();
                Fahrenheit2Celsius MeasurFahrenheit = new Fahrenheit2Celsius(GetOriginData.GetData("Fahrenheit"));
                break;
        }
    }
}