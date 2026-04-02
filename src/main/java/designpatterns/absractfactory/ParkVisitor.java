package designpatterns.absractfactory;

class ParkVisitor {

    public static void main(String[] args) {
        // בחירת אזור לפי נושא (factory)
        AbstractFoodStallFactory adventureLandFactory = new
                AdventureLandFactory();
        AbstractFoodStallFactory fantasyLandFactory = new
                FantasyLandFactory();
        // הזמנת אוכל לפי נושאים
        IceCream tropicalIceCream = adventureLandFactory.
                crateIceCream();
        Pizza exoticPizza = adventureLandFactory.cratePizza();
        IceCream magicalIceCream = fantasyLandFactory.crateIceCream();
        Pizza enchantedPizza = fantasyLandFactory.cratePizza();
        // תהנו מפרטי המזון לפי נושא
        tropicalIceCream.enjoy();
        exoticPizza.enjoy();
        magicalIceCream.enjoy();
        enchantedPizza.enjoy();
    }
}


