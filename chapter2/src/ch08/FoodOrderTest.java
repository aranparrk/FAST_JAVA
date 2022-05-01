package ch08;

public class FoodOrderTest {

    public static void main(String[] args) {
        FoodOrder foodOrder = new FoodOrder();

        foodOrder.orderNumber = "202011020003";
        foodOrder.phoneNumber = "01023450001";
        foodOrder.address = "서울시 강남구 역삼동 111-333";
        foodOrder.orderDate = "20201102";
        foodOrder.orderTime = "130258";
        foodOrder.price = 35000;
        foodOrder.menuNumber = "0003";

        foodOrder.showFoodOrder();


    }

}
