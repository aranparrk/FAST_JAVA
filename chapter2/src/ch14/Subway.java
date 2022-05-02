package ch14;

public class Subway {

    int lineNumber;
    int passengerCont;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCont++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "번 지하철 승객수는 " + passengerCont + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
