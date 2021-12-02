package w11dot1;
public class Employee {
    protected String name;

    protected int serialNumber;

    /**
     *
     */
    Employee(){
        name = "none";
        serialNumber = 0;
    }

    /**
     * @param name
     * @param serial
     */
    Employee(String name, int serial){
        this.name = name;
        this.serialNumber = serial;
    }

    /**
     * @return
     */
    // Getter for name
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    //Getter for serial
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber
     */
    //Setter for serial
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return
     */
    public double getGrossPay(){
        return 0;
    }

    /**
     * @return
     */
    public double getFedWithholding(){
        return 0;
    }

    /**
     * @return
     */
    public double getStateWithholding(){
        return 0;
    }

    /**
     * @return
     */
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
