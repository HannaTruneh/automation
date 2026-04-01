package designpatterns.builder;

class ConcreteBuilder implements Builder {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        product.addPart("Whole Wheat Bread");
    }

    @Override
    public void buildPartB() {
        product.addPart("Turkey");
    }

    @Override
    public void buildPartC() {
        product.addPart("Lettuce, Tomato, Onion");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
