import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1, c, num = 0, i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        num = scan.nextInt();
        scan.close();

        System.out.print(a + " " + b);
        for (i = 2; i < num; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
