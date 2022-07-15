package anush.dsa.Basics;

public class temp {
    public static void main(String[] args){
        int[] ar={7,8,3,1,2};
        for(int i=0;i<ar.length-1;i++){
            int small=ar[i];
            for(int j=i+1;i<ar.length;i++){
                if(small>ar[j]){
                    small=ar[j];
                }

            }
            int temp=small;
            small=ar[i];
            ar[i]=temp;




        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);}

    }
}
