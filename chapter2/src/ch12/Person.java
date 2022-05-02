package ch12;

public class Person {

    String name;
    int age;

    public Person(){
        this("이름 없음", 29);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + " : " + age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main (String[] agrs) {
        Person person1 = new Person();
        person1.showPerson();

        System.out.println("person1 : " + person1);

        Person person2 = person1.getPerson();
        System.out.println("person2 : " + person2);
    }
}
