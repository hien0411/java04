package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        int dem = 0;
        System.out.println("nhap so a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a!=0){
            k = a % 10;
            if(k % 2 != 0){
                dem += 1;
            }
            a /= 10;
        }
        System.out.println("so luong so le =  " + dem);
    }
}