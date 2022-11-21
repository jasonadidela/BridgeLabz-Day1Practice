//1.6 Write a program to demonstrate static variables, methods, and blocks.

public class Main {

    static int x = 16;              //Initiating static variable
    static int y;                   //Initiating method
    static void func()              //Initiating block
    {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + 7);
    }
    static {
        System.out.println("Running static initialization block.");
        y = x + 4;
    }
    public static void main(String[] args) {
        func();
        System.out.println("Welcome to Main class");
        System.out.println("Welcome to 1.6_demonstrate Branch");
    }
}