package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrDeepCopy = arrDeepCopy(arr);

        for (int el : arrDeepCopy) {
            System.out.print(el + " ");
        }

        arrDeepCopy[4] = 100;
        System.out.println();

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static int[] arrDeepCopy(int[] source) {
        int[] destination = new int[source.length];
//        for (int i = 0; i < source.length; i++) {
//            destination[i] = source[i];
//        }
        System.arraycopy(source, 0, destination, 0, source.length);
//        return Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);
        return destination;
    }
}
