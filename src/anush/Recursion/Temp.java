package anush.Recursion;

public class Temp {
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int x=5;
        print(x);

    }
}
