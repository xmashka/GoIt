package module5;

public class SortAscending {
    public void sorting(int arrayInteger[]) {
        boolean indicator = true;

        while (indicator) {

            indicator = false;
            for (int i = 0; i < arrayInteger.length - 1; i++) {

                if (arrayInteger[i] > arrayInteger[i + 1]) {
                    int tempVariable = arrayInteger[i];
                    arrayInteger[i] = arrayInteger[i + 1];
                    arrayInteger[i + 1] = tempVariable;
                    indicator = true;
                }
            }
        }
        for (int i = 0; i < arrayInteger.length; i++) {
            System.out.print(arrayInteger[i] + " ");
        }
    }
}
