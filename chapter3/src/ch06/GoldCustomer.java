package ch06;

public class GoldCustomer extends Customer{

    double saleRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        saleRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
