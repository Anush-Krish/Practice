package anush.Exception;

public class Exception8 {
    public static int func(){
        try {
            int a = 50;
            int b = 2;
            return a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally printed anyway.");
        }
        return -1;
    }

    public static void main(String[] args) {
        func();
    }
}
