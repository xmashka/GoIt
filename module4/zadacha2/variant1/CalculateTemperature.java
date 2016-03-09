package module4.zadacha2.variant1;

import java.util.Scanner;

/**
 Для перевода температуры из шкалы Фаренгейта в шкалу Цельсия нужно от исходного числа отнять 32 и умножить результат на 5/9.
 Для перевода температуры из шкалы Цельсия в шкалу Фаренгейта нужно умножить исходное число на 9/5 и прибавить 32.
 */

public class CalculateTemperature {
    public static void main (String[] args){
        System.out.println("Choose original measuring c-Celsius, f-Fahrenheit ");
        Scanner dd = new Scanner(System.in);
        String d = dd.next();
        if (d.charAt(0) == 'c') {
            Celsius2Fahrenheit cf = new Celsius2Fahrenheit();
            cf.getData();
            cf.calculateData();
        }
        else if (d.charAt(0) == 'f')
        {
            Fahrenheit2Celsius cf = new Fahrenheit2Celsius();
            cf.getData();
            cf.calculateData();
        }
    }
}
