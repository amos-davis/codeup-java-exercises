public class Person {
    private String name;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello, " + this.name);
    }

}
