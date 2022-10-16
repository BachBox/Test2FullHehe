package Test2.Model;

import java.util.ArrayList;
import java.util.Scanner;

import Test2.Controller.User;

public class Action {
    private Scanner sc = new Scanner(System.in);
    private User usserTest = new User("Bach123", "bach2112", "bach181020@gmail.com");

    public void fogotPassword() {
        String email;
        System.out.println("Input email here: ");
        email = sc.nextLine();
        if (email.equals(usserTest.getEmail())) {
            // Change password
            System.out.println("Email field is valid, type your new passwprd: ");
            String newPass = sc.nextLine();
            usserTest.setPassWord(newPass);
            // login();
        } else
            System.out.println("Invalid email!");

    }

    public User Register() {
        System.out.println("Input username: ");
        String userName = sc.nextLine();
        for (int i = 0; i < userList.size(); i++)
            if (userName.equals(userList.get(i).getUserName())) {
                System.out.println("Username already exists");
                userName = sc.nextLine();
                i--;
            }
        System.out.println("Input password: ");
        String passWord = sc.nextLine();
        for (int i = 0; i < userList.size(); i++)
        if (passWord.equals(userList.get(i).getPassWord())) {
            System.out.println("Password already exists");
            passWord = sc.nextLine();
            i--;
        }
        System.out.println("Input email: ");
        String email = sc.nextLine();
        for (int i = 0; i < userList.size(); i++)
        if (email.equals(userList.get(i).getEmail())) {
            System.out.println("Email already exists");
            email = sc.nextLine();
            i--;
        }
        userList.add(new User(userName, passWord, email));
        System.out.println("Sign up user successfully!");
        return new User(userName, passWord, email);
    }

    public User login() {
        String userName;
        String passWord;

        do {
            System.out.println("Input username: ");
            userName = sc.nextLine();
            System.out.println("Input password: ");
            passWord = sc.nextLine();
            if (!userName.equals(usserTest.getUserName())) {
                System.out.println("Username invalid. Please check again!");
            }
        } while (!userName.equals(usserTest.getUserName()));
        return new User(userName, passWord);
    }

    private ArrayList<User> userList = new ArrayList<>();

    public void changeUserName() {
        System.out.println("Input new Username: ");
        String newUser = sc.nextLine();
        for (int i = 0; i < userList.size(); i++)
            if (newUser.equals(userList.get(i).getUserName())) {
                System.out.println("Email already exists. Input new Username: ");
                newUser = sc.nextLine();
                i--;
                // Return check if it matches this username in ArrayList
            }
        usserTest.setUserName(newUser);
        // Set new email for userTest;
        System.out.println("Update Username successfully!");
    }

    public void changeEmail() {
        System.out.println("Input new email: ");
        String newEmail = sc.nextLine();
        for (int i = 0; i < userList.size(); i++)
            if (newEmail.equals(userList.get(i).getEmail())) {
                System.out.println("Email already exists");
                newEmail = sc.nextLine();
                i--;
            }
        usserTest.setEmail(newEmail);
        System.out.println("Update Email successfully!");
    }

    public void changePassword() {
        System.out.println("Input new password: ");
        String newPass = sc.nextLine();
        usserTest.setPassWord(newPass);
        // Set new password for userTest;
    }

}
