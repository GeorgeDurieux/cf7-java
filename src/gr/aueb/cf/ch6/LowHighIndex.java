package gr.aueb.cf.ch6;
import java.util.Arrays;

public class LowHighIndex {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8 ,8, 8 ,8};
        int[] results = getLowAndHighIndexOf(arr, 8);
        System.out.println(results[0] + " " + results[1]);
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int num) {
        int[] indexes = {-1, -1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                indexes[1] = i;
                count++;
            }
            indexes[0] = indexes[1] - (count - 1);
        }
        return indexes;
    }
}
