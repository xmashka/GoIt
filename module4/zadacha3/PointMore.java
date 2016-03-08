package module4.zadacha3;

import java.util.Scanner;

public class PointMore  {
    int x;
    int y;

    public void getData() {
        System.out.println("Input x ");
        Scanner x = new Scanner(System.in);
        this.setX(x.nextInt());
        System.out.println("Input y ");
        Scanner y = new Scanner(System.in);
        this.setY(y.nextInt());
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
