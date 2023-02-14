package Week1;

import java.util.Scanner;

//khamdaeng
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so n vao: ");
        int n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            if (isprimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isprimeNumber(int s) {
        if (s < 2) {
            return false;
        }
        for (int i = 2; i <= s / 2; i++) {
            if (s % i == 0) {
                return false;
            }

        }
        return true;
    }
}
