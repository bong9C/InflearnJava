package Backjun;

import java.util.Scanner;

public class Ex_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i <= a; i++){
            for(int n=1; n <= i; n++){
                System.out.print("*");
            }
            System.out.println();
    }

    }
}
