package app;
public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "red";


        while (count <= 10) {
            System.out.println("the count  is " + count);
            count = count + 1;
         }
         System.out.println("the count is finished");

         while (color == "red") {
             System.out.println("the color is " + color);
             color = "green";
         }
        System.out.println("color is finished");
       
        boolean livesInMinnesota = true;
        
        while (livesInMinnesota == true) {
            System.out.println("i dont live in minnesota");
            System.out.println(livesInMinnesota);
            livesInMinnesota = false;
         }
        System.out.println("livesInMinnesota = false");


    
    }
}
