package day_2;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so luong so nguyen to dau tien: ");
            int number = scanner.nextInt();
            System.out.println("So nguyen to la: ");
            int cout = 0;
            for (int i = 2; i < 1000; i++) {
                if (cout < number) {
                    boolean check = true;
                    for (int j = 2; j <= i/2; j++) {
                        if (i % j == 0) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        System.out.println(i);
                        cout++;
                    }
                }
            }
        } while (true);

    }
}
arra