package anush.Thread;
//java thread method more from web
//thread.sleep also to be used in try catch.
class Thrd_1 extends Thread{

    public void run(){
//        while(true) {
//            System.out.println("Thanks");
//            try{
//                Thrd_1.sleep(455);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//
//        }
        System.out.println("Thanks");

    }
}class Thrd_2 extends Thread{
    public void run(){
        System.out.println("Thank you.");
    }
}
public class Thread5 {
    public static void main(String[] args) {
        Thrd_1 t1 = new Thrd_1();
        Thrd_2 t2 = new Thrd_2();
        t1.start();
        //join is for when t1 stops after that t2 will start.
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println();


        }
        t2.start();
    }
}
