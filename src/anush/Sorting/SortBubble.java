package anush.Sorting;

public class SortBubble {
    public static void main(String[] args){
        int[] ar={7,8,3,1,2};
        for(int i= ar.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(ar[j]>ar[j+1]){
                   int temp=ar[j];
                   ar[j]=ar[j+1];
                   ar[j+1]=temp;

                }


            }

        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
        }
    }
}
