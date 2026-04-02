package designpatterns.strategy;

class Client {

    public static void main(String[] args) {
        RoutePlanner planner = new RoutePlanner();
        // הגדרת האסטרטגיה לחישוב הדרך המהירה ביותר
        planner.setStrategy(new FastestRouteStrategy());
        planner.executeStrategy();
        // הגדרת האסטרטגיה לחישוב הדרך הקצרה ביותר
        planner.setStrategy(new ShortestRouteStrategy());
        planner.executeStrategy();
    }
}
