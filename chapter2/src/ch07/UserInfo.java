package ch07;

public class UserInfo {

    public String userId;
    public String userPassword;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    public UserInfo() {
        System.out.println("default constructor call");
    }

    public UserInfo(String userId, String userPassword, String userName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;

        System.out.println("overloading constructor call");
    }

    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
    }
}
