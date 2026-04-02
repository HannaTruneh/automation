package designpatterns.factorymethod;

 class IceCream extends Product {

     @Override
     public Product serve() {
         System.out.println("Ice cream served");
         return this;
     }
}
