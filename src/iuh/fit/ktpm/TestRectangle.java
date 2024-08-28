/* @description:
 *@author: Huy, Le NNguyen Quoc
 *@version: 1.0
 *@created: 28/08/2024
 */
package iuh.fit.ktpm;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("chieu dai hien tai :"+r1.getLenght());
        System.out.println("chieu rong hien tai :"+r1.getWidth());

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri chieu dai: ");
        double length = sc.nextDouble();
        System.out.println("nhap gia tri chieu rong: ");
        double width = sc.nextDouble();

        Rectangle r2 = new Rectangle(length, width);
        System.out.println("chu vi hinh chu nhat la: "+r2.getPerimeter());
        System.out.println("dien tich hinh chu nhat la: "+r2.getArea());

        r2.setLenght(30);
        r2.setWidth(15);

        System.out.println("chieu dai moi la: "+r2.getLenght());
        System.out.println("chieu rong moi la: "+r2.getWidth());

    }
}
