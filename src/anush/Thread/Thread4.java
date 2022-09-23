package anush.Thread;
class Thred extends Thread{
    Thred(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println(this.getName());
    }
}
public class Thread4 {
    public static void main(String[] args) {

        Thred t1 = new Thred("a");
        Thred t2 = new Thred("b");
        Thred t3 = new Thred("c");
        Thred t4 = new Thred("d");
        Thred t5 = new Thred("e");
        t1.setPriority(Thred.MIN_PRIORITY);
       t5.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
