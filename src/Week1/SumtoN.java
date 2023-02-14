package Week1;

import java.util.Scanner;

//khamdaeng
public class SumtoN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap N vao: ");
        int input = scan.nextInt();
        System.out.print(Sum(input));
    }

    public static int Sum(int n) {
        int total = 0;
        while (n > 0) {
            int map = n % 10;
            total += map;
            n = n / 10;
        }
        return total;
    }
}
