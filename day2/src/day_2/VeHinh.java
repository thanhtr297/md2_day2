package day_2;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case (1):
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (i<=j) {
                                System.out.print("* ");
                            }

                        }System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            if (true) {
                            System.out.print("*");
                        } }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);




    }
}
