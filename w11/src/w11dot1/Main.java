package w11dot1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Employee> employeeList = new ArrayList<>();
        employeeList.add(new Hourly(15.0,30,"Harry Hacker",123));
        employeeList.add(new Hourly(12.50,20,"Isabel Intern",233));
        employeeList.add(new Salaried("Cathy Coder", 611, 80000));

        System.out.println("Payroll Report");

        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
//            System.out.printf("""
//                    Employee: % Serial: 123
//                    Gross Pay: $450.00
//                    Federal Withholding: $67.50
//                    State Withholding: $31.50
//                    Net Pay: $351.00
//
//                    Employee: Isabell Intern Serial: 233
//                    Gross Pay: $250.00
//                    Federal Withholding: $37.50
//                    State Withholding: $17.50
//                    Net Pay: $195.00
//
//                    Employee: Catherine Coder Serial: 611
//                    Gross Pay: $1,538.46
//                    Federal Withholding: $230.77
//                    State Withholding: $107.69
//                    Net Pay: $1,200.00
//                    """)
        }
    }
}
