package Java_Playground;

public abstract class Employee {

    private String Name;
    private String Address;
    private int Number;


    public Employee(String name, String address, int number) {
        this.Name = name;
        this.Address = address;
        this.Number = number;
        System.out.println("Constructing an emplpoyee.");
    }

    public double computePay() {
        System.out.println("Inside employee pay.");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mail this out to " + this.Name + "'s name and here is his address: " + this.Address + " .");
    }

    public String getName() {
        return this.Name;
    }

    public String getAddress() {
        return Address;
    }

    public int Number() {
        return Number;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String toString() {
        return Name + Address + Number;
    }
}
