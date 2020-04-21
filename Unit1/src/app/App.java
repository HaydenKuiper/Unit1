package app;

public class App {
    public static void main(String[] args) throws Exception {
          
       for (int i = 0; i < 20; i++) {
            if (i == 10) {
                int x = 1;
                 while (x <= 6) {
                    System.out.println(i);
                    x++;
                }
            }else {
                System.out.println(i);
            } 
        }
        System.out.println("End First Loop");
        System.out.println("Start Second Loop");

        for (int i = -1; i < 20; i++ ) {
            if (i %3 == 0){

        }
        else{
            System.out.println(i);
        }
    }
}
}

