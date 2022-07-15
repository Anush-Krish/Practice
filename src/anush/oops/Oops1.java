package anush.oops;

class Pen{
    String Color;
    String Type;


    public void PrintColor(){
        System.out.println(this.Color);
    }
    public void PrinType(){
        System.out.println(this.Type);
    }
}


public class Oops1 {
    public static void main(String[] args){
        Pen Pen1=new Pen();
        Pen1.Type="Gel";
        Pen1.Color="Black";



        Pen Pen2=new Pen();
        Pen2.Type="Ball";
        Pen2.Color="Blue";
        Pen2.PrinType();
        Pen2.PrintColor();
        Pen1.PrintColor();
        Pen1.PrinType();




    }

}
