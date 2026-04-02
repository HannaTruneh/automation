package cleancode.ocp;

public class FixedDiscount implements Discount {

     private double discount;

     public FixedDiscount(double discount){
         this.discount = discount;
     }

     @Override
    public double apply(double totalPrice) {
         return totalPrice - discount;

     }
}
