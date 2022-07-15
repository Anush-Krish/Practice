package anush.BitMan;

//set bit
public class Bits2 {
    public static void main(String[] args){
        int n=3; //0011
        int pos =2;
        int BitMask=1<<pos;

        int NewNumber=BitMask | n;   //7  0111
        System.out.println(NewNumber);

    }
}
