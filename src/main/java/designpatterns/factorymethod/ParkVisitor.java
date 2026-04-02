package designpatterns.factorymethod;

public class ParkVisitor {
    public static void main(String[] args) {
        FoodStall pizzaStall = new PizzaStall();
        FoodStall iceCreamStall = new IceCreamStall();

        // הזמנה של מנות מדוכנים שונים
        Product pizza = pizzaStall.takeOrder();
        Product icCream = iceCreamStall.takeOrder();
    }
}
