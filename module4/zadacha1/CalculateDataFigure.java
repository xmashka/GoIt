package module4.zadacha1;

public class CalculateDataFigure {
    static final float PI = 3.14F;

    CalculateDataFigure(int typeFigure, int lehght1, int lehght2){
        float area;
        if (typeFigure == 1) {
            area = lehght1 * lehght2 / 2;
        }
        else {
            area = lehght1 * lehght2;
        }
        System.out.println("Area is " + area);
    }

    public CalculateDataFigure(int radiusCircle) {
        double area;
        area = PI*Math.pow(radiusCircle,2);
        System.out.println("Area is " + area);
    }
}
