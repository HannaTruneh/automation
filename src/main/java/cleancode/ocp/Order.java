package cleancode.ocp;

public class Order {

    private double totalPrice;
    private Discount discount;

    public Order(double totalPrice, Discount discount) {
        this.totalPrice = totalPrice;
        this.discount = discount;
    }

    public double getTotalPriceAfterDiscount() {
        return discount.apply(totalPrice);
    }
}
