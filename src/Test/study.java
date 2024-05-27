package Test;

public class study {
    int x;
}
 class test {
     public static void main(String[] args) {
         study a = new study();
         a.x = 10;
         System.out.println("main() : x = " + a.x );

         change(a.x);
         System.out.println("After change(a.x)");
         System.out.println("main() : x = " + a.x);
     }
     static void change(int x) {
         x = 1000;
         System.out.println("change() : x = " + x);
     }
 }