//1.3 Write a program to check two strings are equal or not.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Main class");
        System.out.println("Welcome to New Branch 1.3_StringEqual");
        Scanner var = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = var.nextLine();
        Scanner v = new Scanner(System.in);
        System.out.println("Enter other username");
        String otherUserName = v.nextLine();
        if (userName.equals(otherUserName)) {
        System.out.println("userName is matching");
        } else {
           System.out.println("userName is not matching");
          }
    }
}
