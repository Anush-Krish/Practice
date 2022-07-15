package anush.oops;

//inheritance:
class Color{
    String Color;
    Color(){}


}
class Vehic extends Color{
    String vType;
    public void printInfo(String Color){
        System.out.println(this.Color);
    }
    Vehic(String vType,String Color){
        this.Color=Color;
        this.vType=vType;
    }



}
public class Oops6 {
    public static void main(String args[]) {
        Vehic Lambo = new Vehic("CAR", "Black");
        Lambo.printInfo(Lambo.Color);
    }

}
