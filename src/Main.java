import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next() ;
        System.out.println("Your name is: " + name);
        System.out.println("Enter your age ");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old");

    }
}