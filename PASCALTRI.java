package com.java;
import java.util.Scanner;
public class PASCALTRI {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int a, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row:");      
        a = sc.nextInt();
        for(i = 0; i <= a; i++) {
           for(j = 0; j <= a-i; j++){
              System.out.print(" ");
           }
           for(j = 0; j <= i; j++){
              System.out.print(" "+factorial(i) / ( factorial(i-j) * factorial(j)) );
           }
           System.out.println();
        }
    }
}

