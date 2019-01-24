import java.util.Scanner;

public class elizaSimple {
    public static void main(String[]args){
        // evaluate what the user asks
        // turn the user input into a question that sounds like the therapist really cares

        System.out.println("Good day. How are you doing today?");
        // Your first task is to develop a program with a running loop.
        // If the user types in "I am feeling great" or enter "Q", the program will stop running.
        // Your program should print out the last input (as an output) every time before accepting new input.
        Scanner input = new Scanner(System.in);
        String response = " ";
        boolean quit = false;
        do {
            System.out.println("Enter your response here, or press Q to quit.");
            response = input.nextLine();
            System.out.println(response);
            quit = checkQuitCommand(response);
        }while (!quit);


        System.out.println(">>> END");

    }

    public static boolean checkQuitCommand(String r){
        boolean quit = false;
        if (r.equalsIgnoreCase("Q") || r.equalsIgnoreCase("I am feeling great")){
            quit = true;}
//        }else if (r.equalsIgnoreCase("I am feeling great")){
//            quit = true;
//        }
        return quit;
    }
}
