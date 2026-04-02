package designpatterns.factorymethod;

abstract class FoodStall {

    abstract Product prepareFood();

    Product takeOrder() {
        System.out.println("Order placed at " + this.getClass().getSimpleName() + "!");
        Product product = prepareFood();
        return product.serve();
    }
}
