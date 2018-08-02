public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools tool = new BurgerTools();
        tool.mostPopularTopping = "Pepperoni";
        tool.averageDaysBeforeExpiration = 3;
        tool.temperatureWhenCooked = 71;

        System.out.println(tool.mostPopularTopping);
        System.out.println(tool.averageDaysBeforeExpiration);
        System.out.println(tool.temperatureWhenCooked);
    }
}
