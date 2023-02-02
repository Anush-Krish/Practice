package anush.dsaDPP;

import java.util.Arrays;

//reverse array
public class dpp2_array {
    public static void main(String[] args) {
        int[] arr={5,1,3,10,4,2};
        for(int i=0;i<=arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }
        if(arr.length%2==0){
            int temp1=arr[arr.length/2];
            arr[arr.length/2]= arr[arr.length/2-1];
            arr[arr.length/2-1]=temp1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
