package designpatterns.absractfactory;

 class FantasyLandFactory  implements AbstractFoodStallFactory {
     @Override
     public IceCream crateIceCream() {
         System.out.println("Creating magical-themed ice cream");
         return new MagicalIceCream();
     }

     @Override
     public Pizza cratePizza() {
         System.out.println("Creating enchanted-themed pizza");
         return new EnchantedPizza();
     }
}
