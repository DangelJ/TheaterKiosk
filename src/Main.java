import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.println("Enter your age: ");

        if(console.hasNextInt()){
            age = console.nextInt();;
            console.nextLine();

            if (age >= 21){
                System.out.println("You're " + age + ", you get a wrist band.");
            }
        } else {
            trash = console.nextLine();
            System.out.println("You said your age is " + trash + ", this is an incorrect format.");
            System.out.println("Please run the code again.");
        }


    }
}