package designpatterns.Factorymethod;

class IceCreamStall extends FoodStall {
    @Override
    Product prepareFood() {
        System.out.println("Ice cream is being prepared");
        return new IceCream();
    }
}
