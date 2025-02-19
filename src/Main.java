import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        String[] arr3 = new String[]{"A", "B", "C", "D"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[0]);
        System.out.println();
        for (int i = arr2.length - 1; i > 0; i--) {
            System.out.print(arr2[i] + ",");
        }
        System.out.print(arr2[0]);
        System.out.println();
        for (int i = arr3.length - 1; i > 0; i--) {
            System.out.print(arr3[i] + ",");
        }
        System.out.print(arr3[0]);
        System.out.println();
        for (int i = arr.length - 1; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
                arr[0]++;
            }

            System.out.println(Arrays.toString(arr));
        }

    }
}