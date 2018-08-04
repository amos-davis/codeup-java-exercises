package Java_Playground;

public class Salary extends Employee {

    private double propertySalary1;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary1(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class");
        System.out.println("Mailing check to " + getName() + "with salary of " + propertySalary1);
    }

    public double getPropertySalary1() {
        return propertySalary1;
    }

    public void setSalary1(double newSalary) {
        if (newSalary >= 0.0) {
            this.propertySalary1 = newSalary;
        }
    }


    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return this.propertySalary1 / 52;
    }
}
