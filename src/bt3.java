import javax.swing.*;
import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai hinh vuong ");
        Double cdai = sc.nextDouble();
        System.out.println("nhap chieu rong hinh vuon ");
        Double crong = sc.nextDouble();
        Double chuvi = ((cdai + crong)*2);
        Double dientich = (cdai * crong);
        System.out.println(" chu vi hinh chu nhat la : " + chuvi );
        System.out.println( " dien tich hinh chu nhat la : " + dientich );


    }
}
