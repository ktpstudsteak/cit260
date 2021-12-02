package w11dot1;

public class Hourly extends Employee{
    private double hourlyWage;
    private double hoursWorked;

    /**
     *
     */
    Hourly(){
        hourlyWage = 0.0;
        hoursWorked = 0.0;
    }

    /**
     * @param wage
     * @param hours
     * @param name
     * @param serial
     */
    Hourly(double wage, double hours,String name, int serial){
        super(name,serial);
        this.hourlyWage = wage;
        this.hoursWorked = hours;
    }

    /**
     * @return
     */
//    Wage Getter
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * @return
     */
//  Hours getter
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @return
     */
    @Override
    public double getGrossPay() {
        return hourlyWage * hoursWorked;
    }

    /**
     * @return
     */
    @Override
    public double getStateWithholding() {
        return getGrossPay() * .07;
    }

    /**
     * @return
     */
    @Override
    public double getFedWithholding() {
        return getGrossPay() * .15;
    }

    /**
     * @return
     */
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
