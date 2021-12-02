package w11dot1;

public class Hourly extends Employee{
    private double hourlyWage;
    private double hoursWorked;

    Hourly(){
        hourlyWage = 0.0;
        hoursWorked = 0.0;
    }

    Hourly(double wage, double hours){
        hourlyWage = wage;
        hoursWorked = hours;
    }
//    Wage Getter
    public double getHourlyWage() {
        return hourlyWage;
    }

//  Hours getter
    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double getGrossPay() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public double getStateWithholding() {
        return getGrossPay() * .07;
    }

    @Override
    public double getFedWithholding() {
        return getGrossPay() * .15;
    }
}
