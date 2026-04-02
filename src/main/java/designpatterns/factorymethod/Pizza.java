package designpatterns.factorymethod;

class Pizza  extends  Product {

    @Override
    public Product serve() {
        System.out.println("Pizza served");
        return this;
    }
}
