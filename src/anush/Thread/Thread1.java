package anush.Thread;

class Thread_1 extends Thread{

    @Override
    public void run() {
        int i=0;
        while (i<200) {
            System.out.println("1st thread");
            System.out.println("run 1st thread");
            i++;
        }
    }
}
class Thread_2 extends Thread{

    @Override
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("2nd thread");
            System.out.println("run 2nd thread");
        i++;
    }
    }

}

public class Thread1 {
    public static void main(String[] args) {


        Thread_1 t1 = new Thread_1();
        Thread_2 t2 = new Thread_2();
        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
