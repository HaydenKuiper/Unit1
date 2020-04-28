package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your first name");
        String firstname = input.nextLine();
        System.out.println("please enter your last name");
        String lastname = input.nextLine();
        
       

        System.out.println("please enter your age");
        String age = input.nextLine();
        System.out.println("please enter grade");
        String grade = input.nextLine();
        System.out.println("please enter your favorite color");
        String favcolor = input.nextLine();
        System.out.println("hello," + " " + firstname);
        System.out.println("hello, " + lastname);
        System.out.println("you are this old " + age);
        System.out.println("you are in this grade " + grade);
        System.out.println("this is your favorite color " + favcolor);
        


    
  
    
    
    }
}

