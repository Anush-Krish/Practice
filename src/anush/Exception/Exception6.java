package anush.Exception;

public class Exception6 {
    public static int divide(int a,int b) throws ArithmeticException{
        return a/b;

    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(6, 0));
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
