package designpatterns.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructSandwich() {
        builder.buildPartC();
        builder.buildPartB();
        builder.buildPartC();
    }
}

