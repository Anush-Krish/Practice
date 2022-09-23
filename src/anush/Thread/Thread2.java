package anush.Thread;
class Thrd1 implements Runnable{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("1st thread running.");
            i++;
        }
    }
}
class Thrd2 implements Runnable{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("2nd thread running.");
            i++;
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        Thrd1 t1=new Thrd1();
        Thread gun1=new Thread(t1);
        Thrd2 t2=new Thrd2();
        Thread gun2=new Thread(t2);
        gun1.start();
        gun2.start();



    }
}
