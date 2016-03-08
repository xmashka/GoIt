package module4.zadacha1;

public class CalculateDataFigure {
    static final float PI = 3.14F;

    CalculateDataFigure(int param1, int param2, int param3){
        float area = param2 * param3;
        if (1 == param1) {
            area = area /2;
        }
//        area = 1 == param1 ? area/2 : area;
//        if (param1 == 1) {
//            area = param2 * param3 / 2;
////            System.out.println("Area is " + area);
//        }
//        else if (param1 == 2) {
//
////            System.out.println("Area is " + area);
//        }
        System.out.println("Area is " + area);
    }

    public CalculateDataFigure(int param4) {
        double area;
        area = PI*Math.pow(param4,2);
        System.out.println("Area is " + area);
    }
}
