package gr.aueb.cf.ch6;

public class CarParkingApp {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
        int[][] arr2 = new int[2 * arr.length][2];
        int k = 0;
        int simultaneous = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[k][0] = arr[i][j];
                arr2[k][1] = (j == 0) ? 0 : 1;
                k++;
            }
        }

        bubbleSort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i][1] == 0) {
                simultaneous++;
                if (simultaneous > max) max = simultaneous;
            } else {
                simultaneous--;
            }
        }

        System.out.println("Maximum simultaneous cars in the parking lot: " + max);
    }

    public static void bubbleSort(int[][] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i][0] > arr[i + 1][0]) {
                    int[] temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}

