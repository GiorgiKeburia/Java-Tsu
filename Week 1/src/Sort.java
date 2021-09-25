import java.util.Arrays;

public class Sort {
    public int[] arr;
    Sort(int[] a){
        arr = a;
    }
    public void sort() {
        System.out.println("Starter arr: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int current = arr[i];

                arr[i] = arr[i + 1];
                arr[i + 1] = current;

                i = -1;
            }
        }
        System.out.println("Final arr: " + Arrays.toString(arr));
    }

}
