package designpatterns.absractfactory;

 class AdventureLandFactory implements AbstractFoodStallFactory {
     @Override
     public IceCream crateIceCream() {
         System.out.println("Creating tropical-themed ice cream");
         return new TropicalIceCream();
     }

     @Override
     public Pizza cratePizza() {
         System.out.println("Creating exotic-themed pizza");
         return new ExoticPizza();
     }
}
