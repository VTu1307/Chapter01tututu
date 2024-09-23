import javax.swing.*;
import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("nhap gia tri n");
        n = sc.nextInt();
        double sinValue = Math.sin(Math.toRadians(n));
        double cosValue = Math.cos(Math.toRadians(n));
        double sr = Math.sqrt(n);
        System.out.println("sin(" + n + ") =" + sinValue);
        System.out.println("cos(" + n + ") =" + cosValue);
        System.out.println("sr(" + n + ") =" + sr);

    }
}
