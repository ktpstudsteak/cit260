package com.company;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("This program converts a hexadecimal digit into a four digit binary number.\nEnter a hexadecimal number: ");

        Scanner in = new Scanner(System.in);

        String strHexIn = in.next();

        //array of options
//      arrHex[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E",  "F"};
        List<String> arrHex = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E",  "F");

        //If not in there error out

        boolean boolValidIn = arrHex.contains(strHexIn);

        if (boolValidIn) {
            switch (strHexIn) {
                case "0" -> System.out.println("The binary value is 0." + "\n" + "Goodbye.");
                case "1" -> System.out.println("The binary value is 0001." + "\n" + "Goodbye.");
                case "2" -> System.out.println("The binary value is 0010." + "\n" + "Goodbye.");
                case "3" -> System.out.println("The binary value is 0011." + "\n" + "Goodbye.");
                case "4" -> System.out.println("The binary value is 0100." + "\n" + "Goodbye.");
                case "5" -> System.out.println("The binary value is 0101." + "\n" + "Goodbye.");
                case "6" -> System.out.println("The binary value is 0110." + "\n" + "Goodbye.");
                case "7" -> System.out.println("The binary value is 0111." + "\n" + "Goodbye.");
                case "8" -> System.out.println("The binary value is 1000." + "\n" + "Goodbye.");
                case "9" -> System.out.println("The binary value is 1001." + "\n" + "Goodbye.");
                case "A" -> System.out.println("The binary value is 1010." + "\n" + "Goodbye.");
                case "B" -> System.out.println("The binary value is 1011." + "\n" + "Goodbye.");
                case "C" -> System.out.println("The binary value is 1100." + "\n" + "Goodbye.");
                case "D" -> System.out.println("The binary value is 1101." + "\n" + "Goodbye.");
                case "E" -> System.out.println("The binary value is 1110." + "\n" + "Goodbye.");
                case "F" -> System.out.println("The binary value is 1111." + "\n" + "Goodbye.");
            }
        }

        else {
            System.out.println(strHexIn + " is not a valid hexadecimal digit.\n" +
                    "Goodbye.");
        }




    }
}
