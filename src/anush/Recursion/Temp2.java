package anush.Recursion;

public class Temp2 {
    public static int Fact(int n){
        if(n==0 || n==1){
            return 1;
        }

        int k=Fact(n-1);
        return n*k;


    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(Fact(n));

    }
}
