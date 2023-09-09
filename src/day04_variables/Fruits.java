package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have\t" + apples);
        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: " + bananas);

        System.out.println("I sold some apples - 20 apples sold");
        apples = 30;
        System.out.println("Apples after I sold: " + apples);

        int price = 150;
        System.out.println("The price of my 30 apples is 150");
        System.out.println("The price of my " + apples + " apples is " + price);


    }
}
