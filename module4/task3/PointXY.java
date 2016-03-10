package module4.task3;

import java.util.Scanner;

public class PointXY {
    int x;
    int y;
    public void getData() {
        System.out.println("Input x ");
        Scanner scannerX = new Scanner(System.in);
        this.setX(scannerX.nextInt());
        System.out.println("Input y ");
        Scanner scannerY = new Scanner(System.in);
        this.setY(scannerY.nextInt());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
