package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string with brackets");
        s = sc.nextLine();
        CheckBrackets chkr = new CheckBrackets();
        boolean correct = chkr.checking(s);
        if(correct)
        {
            System.out.println("Brackets are set correctly");
        }
        else
            System.out.println("Brackets are set incorrectly");


    }

}



