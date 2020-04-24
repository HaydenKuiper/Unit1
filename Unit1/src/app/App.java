package app;

public class App {
    public static void main(String[] args) throws Exception {
    
  System.out.println("start first loop");
  for (int i = 0; i <= 10; i = i + 1) {
      System.out.println(i);
      if (i == 5) {
          System.out.println("five");
      }
  }
  System.out.println("end first loop");
  System.out.println("start second loop");
  for (int i = 100; i < 151; i = i + 10) {
      System.out.println(i);
  }
  for ( int i = 150; i <= 200; i = i + 1) {
      System.out.println(i);
      if ( 160 < 200) {
          System.out.println(  + 10);
      }
  }
  
    
    
}
}

