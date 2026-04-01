package designpatterns.Factorymethod;

 class IceCream extends Product {

     @Override
     public Product serve() {
         System.out.println("Ice cream served");
         return this;
     }
}
