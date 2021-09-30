package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("How old be ye, matey?  ");

        Scanner in = new Scanner(System.in);

        int age = in.nextInt();

        if (age < 21) {
            System.out.println("Youth be a wonderful thing arrgghh. Be ye one to enjoy it yarrghh.");
        }
        else {
            System.out.println("Old be good too.");
        }
    }
}
