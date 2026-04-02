package designpatterns.strategy;

class RoutePlanner {

    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        System.out.println("Setting the strategy to calculate the route: "
                + strategy.getClass().getSimpleName());
        this.strategy = strategy;
    }

    public void executeStrategy() {
        System.out.println("Executing the strategy to calculate the route for "
                + strategy.getClass().getSimpleName());
        strategy.calculateRoute();
    }
}
