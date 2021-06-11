import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int age = 51;
        String fname = "JM";
        String lname = "Smith";

        System.out.println("Hello " + fname + " " + lname + ". Are you " + age + " years old?\n\n");

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        fname = input.nextLine();

        System.out.println("What is your last name?");
        lname = input.nextLine();

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println("Hello " + fname + " " + lname + ". Are you " + age + " years old?\n");

        input.close();
    }
}
