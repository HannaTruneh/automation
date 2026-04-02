package designpatterns.strategy;

class FastestRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute() {
        System.out.println("Calculating the fastest route...");
        // מימוש לדרך המהירה ביותר
    }
}
