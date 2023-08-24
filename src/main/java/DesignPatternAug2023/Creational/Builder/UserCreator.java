package DesignPatternAug2023.Creational.Builder;

public class UserCreator {


    public static void main(String[] args) {


        User user = new User.UserBuilder("Saurabh", "Chaturvedi").phone(8953541).build();

        System.out.println(user);
    }
}
