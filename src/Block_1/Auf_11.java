package Block_1;

import java.util.Scanner;

public class Auf_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Radius: ");
        double r = input.nextDouble();


        double area = r * r * Math.PI;
        System.out.println("Flächeninhalt: " + area);
    }
}
