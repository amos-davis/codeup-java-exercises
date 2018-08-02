public class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(5, true);
//            dish.costInCents = 9;
//            dish.nameOfDish = "Fish Plate";
        dish.setNameOfDish("fish plate");

        

//            dish.wouldRecommend = true;

        System.out.println(dish.getNameOfDish());




//        System.out.println(dish.costInCents);
//        System.out.println(dish.nameOfDish);
//        System.out.println(dish.wouldRecommend);

        System.out.println(dish.eat());



    }
}
