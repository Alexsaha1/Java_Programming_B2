package day07_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
        int h = 5;
        int p = h;

        h++; // post-increment - no other code  |  Just increase by 1

        System.out.println("h: " + h);
        System.out.println("p: " + p);

        int k = h++;
        System.out.println("h: " + h);
        System.out.println("k: " + k);

        int g = ++h;

        System.out.println("h: " + h);
        System.out.println("g: " + g);



    }
}
