package module5;

public class MinMaxElement {
    public void minmax(int arrayInteger[]) {
        int min = arrayInteger[0];
        int max = arrayInteger[0];
        for (int i = 1; i < arrayInteger.length - 1; i++) {
            if (arrayInteger[i] < min) {
                min = arrayInteger[i];
            }
            if (arrayInteger[i] > max) {
                max = arrayInteger[i];
            }
        }
        System.out.println("Minimal element " + min);
        System.out.println("Maximal element " + max);
    }
}

