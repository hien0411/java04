package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        int a;
        int demchan = 0;
        int demle   = 0;
        System.out.println("nhap so a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while (a > 0){
            k = a % 10;
            if(k % 2 == 0){
                demchan += 1;
            }
            if (k % 2 != 0){
                demle += 1;
            }
            a /= 10;
        }
        if (demchan == 0){
            System.out.println("Toan chu so le");
        }
        if (demle == 0){
            System.out.println("Toan chu so chan");
        }
        if (demchan != 0 && demle != 0){
            System.out.println("Co ca chan va le");
        }
    }
}