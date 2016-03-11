package module4.task31;

public class MainCalculate {
    public static void main(String[] args)

    {
        DistanceP1P2 distanceP1P2 = new DistanceP1P2();
        Coordinats point1 = new Coordinats();
        Coordinats point2 = new Coordinats();
        System.out.println("The distance between points A and B is " + distanceP1P2.pointxy(point1, point2));
    }
}
