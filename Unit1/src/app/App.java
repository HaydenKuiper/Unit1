package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Dog dog1 = new Dog();
      Dog dog2 = new Dog();
      Dog dog3 = new Dog();

      Scanner input = new Scanner(System.in);
      
      dog1.name = "Cyrus";
      dog1.age = 3;
      dog1.breed = "German Shepard";
      dog2.name = "Abby";
      dog2.age = 5;
      dog2.breed = "Siberian husky";
      dog3.name = "Zoey";
      dog3.age = 1;
      dog3.breed = "Cane Corso";

      System.out.println("the first dogs name is " + dog1.name + " the dogs age is " + dog1.age + " the dogs breed is " + dog1.breed);
      System.out.println("the seconds dog name is "+ dog2.name + " the dogs age is " + dog2.age + " the dogs breed is " + dog2.breed);
      System.out.println("the third dogs name is " + dog3.name + " the dogs age is " + dog3.age + " the dogs breed is " + dog3.breed);
      
      
     





    
    
    }
}
