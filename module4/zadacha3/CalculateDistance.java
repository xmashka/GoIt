package module4.zadacha3;

public class CalculateDistance {
    public static void main (String[] args){
        double d;
        PointMore p1 = new PointMore();
        p1.getData();
        PointMore p2 = new PointMore();
        p2.getData();
        d = Math.sqrt(Math.pow((p2.getX() - p1.getX()),2) + Math.pow((p2.getY() - p1.getY()),2));
        System.out.println("The distance between points A and B is " + d);
    }
}
