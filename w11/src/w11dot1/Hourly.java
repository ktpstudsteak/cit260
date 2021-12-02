package w11dot1;

public class Hourly extends Employee{
    private double hourlyWage;
    private double hoursWorked;

    Hourly(){
        hourlyWage = 0.0;
        hoursWorked = 0.0;
    }

    Hourly(double wage, double hours,String name, int serial){
        super(name,serial);
        this.hourlyWage = wage;
        this.hoursWorked = hours;
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

    @Override
    public String toString() {
        System.out.printf("""
                Employee: %s Serial: %d
                Gross Pay: $%.2f
                Federal Withholding: $%.2f
                State Withholding: $%.2f
                Net Pay: $%.2f
                
                """,this.name,this.serialNumber,this.getGrossPay(),this.getFedWithholding(),this.getStateWithholding(), (getGrossPay() - (getFedWithholding() + getStateWithholding())));
        return "";
    }
}
