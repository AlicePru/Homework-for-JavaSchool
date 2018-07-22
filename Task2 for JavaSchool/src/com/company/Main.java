package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base length: ");
        base = scanner.nextInt();
        if(base%2==0) {
            for (int i = 0; i <= base; i += 2)

            {
                int space = (base - i) / 2;
                Print(space, ' ');
                Print(i, '*');
                System.out.println();
            }
        }
        else for (int i = 1; i <= base; i += 2)

        {
            int space = (base - i) / 2;
            Print(space, ' ');
            Print(i, '*');
            System.out.println();
        }
    }

    private static void Print(int count, char symb) {
        {
            for (int j = 1; j <= count; j++) {
                System.out.print(symb);
            }
        }
    }
}
