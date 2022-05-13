package ch06;

public class Customer {

    // protected : 하위클래스에서만 사용이 가능하다, 외부클래스 사용 불가능
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;


    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
//        System.out.println("Customer(int, String) call");
    }

    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이고, 보너스포인트는 " + bonusPoint + "점 입니다.";
    }
}
