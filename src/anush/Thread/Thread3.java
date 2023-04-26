package anush.Thread;
class Thrd extends Thread{

    Thrd(String name){
        super(name);

    }
    public void run()
    {
        System.out.println("This is a Thread.");
    }
}
public class Thread3 {
    public static void main(String[] args) {
        Thrd t1=new Thrd("anush");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());

    }
}
