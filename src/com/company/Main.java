package com.company;

public class Main {

    public static void main(String[] args) {
        int k;
        int tong = 0;
        System.out.println("nhap so a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a != 0) {
            k = a % 10;
            if (k % 2 != 0) {
                tong += k;
            }
            a /= 10;
        }
        System.out.println(" tong = " + tong);
    }
}
