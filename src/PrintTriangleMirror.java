import java.util.Scanner;

public class PrintTriangleMirror {

    public static void main(String[] args) {

        int num, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        num = sc.nextInt();
        System.out.println();
        n = num;

        for (int r = 1; r <= num; r++) {
            // phần 1
            for (int sp = 1; sp <= r; sp++) {
                System.out.print(" ");
            }
            // phần 2
            for (int k = 1; k <= n; k++) {
                System.out.println("[-]");
            }
            // phần 3
            for (int c = num - r; c >= 1; c--) {
                System.out.println("[-]");
            }
            n--;
            System.out.println();
        }


    }
}
