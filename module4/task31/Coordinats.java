package module4.task31;

import java.util.Scanner;

public class Coordinats {
    private int x;
    private int y;

    Coordinats(){
        System.out.println("Input x ");
        Scanner scanner = new Scanner(System.in);
        this.setX(scanner.nextInt());
        System.out.println("Input y ");
        this.setY(scanner.nextInt());
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
