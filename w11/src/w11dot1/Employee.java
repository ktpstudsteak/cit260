package w11dot1;
public class Employee {
    protected String name;

    protected int serialNumber;

    Employee(){
        name = "none";
        serialNumber = 0;
    }

    Employee(String name, int serial){
        this.name = name;
        serialNumber = serial;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    //Setter for name
    public void setName(String name) {
        this.name = name;
    }
    //Getter for serial
    public int getSerialNumber() {
        return serialNumber;
    }
    //Setter for serial
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getGrossPay(){
        return 0;
    }

    public double getFedWithholding(){
        return 0;
    }

    public double getStateWithholding(){
        return 0;
    }



}
