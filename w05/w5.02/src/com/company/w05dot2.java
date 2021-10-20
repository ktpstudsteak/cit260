package com.company;

public class w05dot2 {

    public static void main(String[] args) {
        // Purpose
        System.out.println("""
                This program displays all of the numbers from 100 to 1000
                that are divisible by both 5 and 6.
                """);
        int itemsInRow = 0;
        for (int i = 100; i <= 1000; i++) {
            if ((i % 5 == 0) && (i % 6 == 0)) {
                System.out.printf("%-4d ", i);
                itemsInRow++;
                if (itemsInRow > 10) {
                    itemsInRow = 0;
                    System.out.println();
                }
            }
        }

    }
}
