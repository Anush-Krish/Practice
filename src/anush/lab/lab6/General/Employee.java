package anush.lab.lab6.General;

public class Employee {
    protected Integer empId;

    private String eName;

    public float basic;

    public Employee(float basics, Integer empId, String empName) {
        this.basic=basics;
        this.empId=empId;
        this.eName=empName;
    }


    public Double earnings(float basic){
        return basic+(0.8*basic)+(0.15*basic);
    }
}
