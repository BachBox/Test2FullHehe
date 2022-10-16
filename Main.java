package Test2.View;

import java.util.Scanner;

import Test2.Controller.User;
import Test2.Model.Action;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static User usserTest = new User("Bach123", "bach2112", "bach181020@gmail.com");
    static Action action = new Action();

    public static void main(String[] args) {
        int key;
        System.out.println("Welcome to our program. You want: ");
        do {
            System.out.println("1. Login");
        System.out.println("2. Register");
        key = Integer.parseInt(sc.nextLine());
        switch (key) {
            case 1:
                chooseLogin();
                break;
            
            case 2:
                action.Register();
                break;

            default:
                System.out.println("Input 1 or 2!");
                break;
        }
        } while (key!=1 && key!=2);

    }
        public static void chooseLogin() {
            User user = action.login();
            if (!user.getPassWord().equals(usserTest.getPassWord())) {
                System.out.println("Password is incorrect, choose 1 of 2: ");
                System.out.println("1. Relogin");
                System.out.println("2. Fogot password");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        action.login();
                        break;
                    case 2:
                        action.fogotPassword();
                        break;
                    default:
                        break;
                }
            }
            // Down here mean login successfully!
    
            System.out.println("Welcome "+ usserTest.getUserName()+ " You can choose theone of the following action: ");
            int choice;
            do {
                System.out.println("1. Change username");
                System.out.println("2. Change email");
                System.out.println("3. Change password");
                System.out.println("4. Log out");
                System.out.println("0. Exit program");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        action.changeUserName();
                        break;
                    case 2:
                        action.changeEmail();
                        break;
                    case 3:
                        action.changePassword();
                        break;
                    case 4:
                        System.out.println("Log out. Choose 1 of 2: ");
                        System.out.println("1. Relogin");
                        System.out.println("2. Fogot password");
                        int choice2 = Integer.parseInt(sc.nextLine());
                        switch (choice2) {
                            case 1:
                                action.login();
                                break;
                            case 2:
                                action.fogotPassword();
                                break;
                            default:
                                break;
                        }
                        break;
    
                    case 0:
                        System.out.println("Thank you, see you again!");
                        break;
                    default:
                        break;
                }
            } while (choice != 0);
        }
        // User user = action.login();
        // if (!user.getPassWord().equals(usserTest.getPassWord())) {
        //     System.out.println("Password is incorrect, choose 1 of 2: ");
        //     System.out.println("1. Relogin");
        //     System.out.println("2. Fogot password");
        //     int choice = Integer.parseInt(sc.nextLine());
        //     switch (choice) {
        //         case 1:
        //             action.login();
        //             break;
        //         case 2:
        //             action.fogotPassword();
        //             break;
        //         default:
        //             break;
        //     }
        // }
        // // Down here mean login successfully!

        // System.out.println("Welcome "+ usserTest.getUserName()+ " You can choose theone of the following action: ");
        // int choice;
        // do {
        //     System.out.println("1. Change username");
        //     System.out.println("2. Change email");
        //     System.out.println("3. Change password");
        //     System.out.println("4. Log out");
        //     System.out.println("0. Exit program");
        //     choice = Integer.parseInt(sc.nextLine());
        //     switch (choice) {
        //         case 1:
        //             action.changeUserName();
        //             break;
        //         case 2:
        //             action.changeEmail();
        //             break;
        //         case 3:
        //             action.changePassword();
        //             break;
        //         case 4:
        //             System.out.println("Log out. Choose 1 of 2: ");
        //             System.out.println("1. Relogin");
        //             System.out.println("2. Fogot password");
        //             int choice2 = Integer.parseInt(sc.nextLine());
        //             switch (choice2) {
        //                 case 1:
        //                     action.login();
        //                     break;
        //                 case 2:
        //                     action.fogotPassword();
        //                     break;
        //                 default:
        //                     break;
        //             }
        //             break;

        //         case 0:
        //             System.out.println("Thank you, see you again!");
        //             break;
        //         default:
        //             break;
        //     }
        // } while (choice != 0);
    //}

    // private static void fogotPassword() {
    // String email;
    // System.out.println("Input email here: ");
    // email = sc.nextLine();
    // if (email.equals(usserTest.getEmail())) {
    // // Change password
    // System.out.println("Email field is valid, type your new passwprd: ");
    // String newPass = sc.nextLine();
    // usserTest.setPassWord(newPass);
    // // login();
    // } else
    // System.out.println("Invalid email!");

    // }

    // private static User login() {
    // String userName;
    // String passWord;

    // do {
    // System.out.println("Input username: ");
    // userName = sc.nextLine();
    // System.out.println("Input password: ");
    // passWord = sc.nextLine();
    // if (!userName.equals(usserTest.getUserName())) {
    // System.out.println("Username invalid. Please check again!");
    // }
    // } while (!userName.equals(usserTest.getUserName()));
    // return new User(userName, passWord);
    // }

}
