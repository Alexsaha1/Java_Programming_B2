package day02_print_statements;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;

public class ShoppingReceipt {
    public static void main(String[] args) {
//        System.out.println(
//                "****************************\n" +
//                "    WELCOME TO THE STORE\n" +
//                "****************************\n" +
//                "\n" +
//                "-------------------------\n" +
//                "\n" +
//                "Cake              $24\n" +
//                "Water             $3.99\n" +
//                "Apple Juice       $7.50\n" +
//                "Bread             $4.25\n" +
//                "\n" +
//                "-------------------------\n" +
//                "TOTAL AMOUNT:     $39.74\n" +
//                "TAX:              $3.90\n" +
//                "\n" +
//                "GRAND TOTAL:      $43.64\n" +
//                "-------------------------\n" +
//                "*******THANK YOU*********\n");

        double cake = 24;
        double water = 3.99;
        double appleJuice = 7.50;
        double bread = 4.25;
        double taxRate = 0.10;



        System.out.println("****************************");
        System.out.println("    WELCOME TO THE STORE");
        System.out.println("****************************");
        System.out.println();
        System.out.println("-------------------------");

        System.out.println("Cake              $" + cake);
        System.out.println("Water             $" + water);
        System.out.println("Apple Juice       $" + appleJuice);
        System.out.println("Bread             $" + bread);
        System.out.println("-------------------------");

        double totalAmount = cake + water + appleJuice + bread;
        double roundedTax = taxRate * totalAmount; // tax = 10%
        double grandTotal = totalAmount + roundedTax;

        System.out.println("TOTAL AMOUNT:     $" + totalAmount);
        System.out.println("TAX:              $" + roundedTax);
        System.out.println();
        System.out.println("GRAND TOTAL:      $" + grandTotal);
        System.out.println("-------------------------");
        System.out.println("*******THANK YOU*********");


    }
}
