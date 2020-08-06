package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int k;
        int min = 10;
        int dem = 0;
        System.out.println("nhap so a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while (a>0){
            k =  a % 10;
            a /= 10;
            if(k < min){
                min = k;
                dem += 1;
            }
        }
        System.out.println("so luong chu so nho nhat la: " + dem);
    }
}