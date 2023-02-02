package anush.dsaDPP;

import java.util.Arrays;

//smallest and largest element of array;
public class dpp1_array {
    public static void main(String[] args) {
        int[] arr={100,10,5,45,40};


        for(int i=arr.length-1;i>0;i--) {
            for(int j=0;j<i;j++){
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }}
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}
