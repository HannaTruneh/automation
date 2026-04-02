package cleancode.ocp;

public class PercentageDiscount implements Discount {

    private double discount;

    public PercentageDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double apply(double totalPrice) {
        return totalPrice * (1- discount / 100);
    }
}

