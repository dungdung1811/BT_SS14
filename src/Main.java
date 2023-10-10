import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[20];
            for (int i = 0; i < 20; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
            bubblesort(arr);
        System.out.println("XẮP XẾP NỔI BỌT: " + Arrays.toString(arr));
            selecsionSort(arr);

        System.out.println("XẮP XẾP LỰA CHỌN: "+ Arrays.toString(arr));
    }

    private static void selecsionSort(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1 ; j < arr.length - 1; j++) {
                if (arr[j] < arr[min]){
                   min = j;
                }
                if(min != i)  {
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }

            }
        }
    }

    private static void bubblesort(int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -i ; j++) {
                swap(arr,j,j+1);

            }
        }
    }

    private static void swap(int [] arr, int i1,int i2) {
        if (arr[i1]> arr[i2]){
            int teamp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = teamp;
        }
    }

}