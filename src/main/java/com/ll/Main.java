package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc =new Scanner(System.in);

        String st =calculator.run(sc.nextLine());
        System.out.println(st);
    }
}