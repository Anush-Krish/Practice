package anush.Exception;
class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius Cannot be negative.";
    }
    public String getMessage(){
        return "Give positive value for radius.";
    }
}
public class Exception7 {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0) {

            throw new NegativeRadiusException();
        }
            double result=Math.PI*r*r;
            return result;


    }

    public static void main(String[] args) {
        try{
            double ar=area(-1);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
