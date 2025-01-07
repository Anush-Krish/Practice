package anush.lab;

public class PrimeRange {

    public static void main(String[] args) {


        for(int i=1;i<100;i++){
            int c=0;
           for(int j=2;j<i;j++){
               if(i%j==0)
                   c++;

            }
        if(c==0){

            System.out.println(i+"prime number");
        }
        else

            System.out.println(i+"Not a prime");

    }
    }
}
