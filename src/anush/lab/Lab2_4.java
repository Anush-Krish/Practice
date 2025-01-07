package anush.lab;


    class ObjectCounter {
        static int count;

        public ObjectCounter() {
            count++;
        }

        public static void main(String args[]) {
            ObjectCounter c1 = new ObjectCounter();
            ObjectCounter c2 = new ObjectCounter();
            ObjectCounter c3 = new ObjectCounter();
            System.out.println(count);
        }
    }
