package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("how many inches are in a foot");
        String foot = input.nextLine();
        if (foot.equals("12")) {
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
        }
        System.out.println("what is the capital of Minnesota?");
        String capital = input.nextLine();
        if (capital.equals("Minneapolis")) {
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
        }
        System.out.println("what year is it");
        String year = input.nextLine();
        if (year.equals("2020")) {
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
        }

        

       
        

        
    
  
    
    
    }
}

