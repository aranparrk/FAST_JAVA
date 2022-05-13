package ch06;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

//        System.out.println("VIPCustomer(int, String) call");
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public String getAgentID() {
        return agentID;
    }
}
