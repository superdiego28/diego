package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num1;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite un  numero");

        num1 = scan.nextInt();

        if(num1%10==0)
            System.out.println("es multiplo de 10");
        else
            System.out.println("no es multiplo de 10 ");





    }
}
