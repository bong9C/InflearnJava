package Test;

public class study8 {
    public static void main(String[] args) {
        int[] b = { 18, 54, 3, 40, 28, 58, 66, 20, 45, 42 };
        int sum = 0;

        for(int n = 0; n < b.length; n++) {
            sum += b[n];

        }
         sum/= 10;

        System.out.println(sum);
    }
}


