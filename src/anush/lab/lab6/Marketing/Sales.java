package anush.lab.lab6.Marketing;

import anush.lab.lab6.General.Employee;

import java.util.Scanner;

public class Sales extends Employee {


    public Sales(float basics, Integer empId, String empName) {
        super(basics,empId,empName);
        super.earnings(basics);
    }

    public double tallowance(float basic) {
        double totalEarning = super.earnings(basic);
        return 0.05 * totalEarning;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee id and employee name: ");
        int empId = scanner.nextInt();
        String empName = scanner.next();
        System.out.print("Enter the basic salary: ");
        float basicSalary = scanner.nextFloat();


        Sales salesPerson = new Sales(basicSalary, empId, empName);

        System.out.println("The emp id of the employee is " + salesPerson.empId);
        System.out.println("The total earning is " + (salesPerson.earnings(basicSalary) + salesPerson.tallowance(basicSalary)));

    }
}
