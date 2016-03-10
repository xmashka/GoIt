package module4.task1;

public class CalculateDataFigure {

    public double CalculateDataTriangle (int lehght1, int lehght2) {
          return lehght1 * lehght2 / 2;
    }

    public  double CalculateDataRectangle (int lehght1, int lehght2) {
        return lehght1 * lehght2;

    }

    public double CalculateDataCircle (int radiusCircle) {
        return Math.PI*Math.pow(radiusCircle,2);
    }
}
