package anush.BitMan;

//clearbit
public class Bits3 {
    public static void main(String[] args){
        int n=3;  //0011
        int pos=1;
        int BitMask=1<<pos;
        int notBitMask=~(BitMask);

        int NewNumber=notBitMask & n;
        System.out.println(NewNumber);



    }
}
