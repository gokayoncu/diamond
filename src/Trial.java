import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int a = klavye.nextInt();

        for (int i = 0; i <= a; i++) {
            for (int b = 0; b < (a - i); b++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = a - 1; i >= 0; i--) {
            for (int j = (a - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
