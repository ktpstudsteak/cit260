package w11dot1;

public class Salaried extends Employee{
    private double annualSalary;

    Salaried(){
        annualSalary = 0.0;
    }

    Salaried(String name, int serial, double salary){
        super(name,serial);
        this.annualSalary = salary;
    }
//    Salary getter
    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double getGrossPay() {
        return annualSalary / 52;
    }

    @Override
    public double getFedWithholding() {
        return getGrossPay() * .07;
    }

    @Override
    public double getStateWithholding() {
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
