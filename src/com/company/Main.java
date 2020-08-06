package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int k;
        int max = 0;
        System.out.println("nhap so a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while (a>0){
            k =  a % 10;
            a /= 10;
            if(k > max){
                max = k;
            }
        }
        System.out.println("max = " + max);
    }
}