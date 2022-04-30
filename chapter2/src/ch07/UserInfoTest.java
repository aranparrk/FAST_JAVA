package ch07;

public class UserInfoTest {

    public static void main(String[] args) {

        UserInfo userLee = new UserInfo();

        System.out.println(userLee.showUserInfo());

        System.out.println("-----값 할당 후 메소드 호출-----");
        userLee.userName = "Lee";
        userLee.userId = "Lee";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("Kim", "1234", "Kim");

        System.out.println(userKim.showUserInfo());
    }

}
