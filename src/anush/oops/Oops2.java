package anush.oops;

//non-paramatarized constructor.
class Student{
    String name;
    int roll;
    public void PrintInfo(){
        System.out.println(this.name);// also without this keyword
        System.out.println(this.roll);//also without this keyword
    }
    Student()
    {
        System.out.println("Constructor Called!");
    }

}

public class Oops2 {
    public static void main(String[] args){
        Student stud1=new Student();
        stud1.name="Krish";
        stud1.roll=14;
        stud1.PrintInfo();
        Student stud2=new Student();
        stud2.name="ANush";
        stud2.roll=9;
        stud2.PrintInfo();

    }
}
