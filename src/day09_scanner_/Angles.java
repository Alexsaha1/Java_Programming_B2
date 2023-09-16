package day09_scanner_;
import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        System.out.println("Enter three angle degree/number: ");

        Scanner input = new Scanner(System.in);
        double angLeOne = input.nextDouble();
        double angLeTwo = input.nextDouble();
        double angLeThree = input.nextDouble();

        double total = angLeOne + angLeTwo + angLeThree;
        boolean isTriangle = total == 180;
        boolean isCircle = total == 360;

        System.out.println("Triangle: " + isTriangle);
        System.out.println("Circle: " + isCircle);
    }

}
