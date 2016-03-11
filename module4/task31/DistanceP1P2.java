package module4.task31;

public class DistanceP1P2 {
    public double pointxy (Coordinats CoordinatsP1, Coordinats CoordinatsP2) {
        double xCoordinat = Math.pow (CoordinatsP2.getX() - CoordinatsP1.getX(),2);
        double yCoordinat = Math.pow (CoordinatsP2.getY() - CoordinatsP1.getY(),2);
        return Math.sqrt(xCoordinat + yCoordinat);

    }
}
