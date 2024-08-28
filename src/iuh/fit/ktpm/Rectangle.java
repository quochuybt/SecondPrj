/* @description:
 *@author: Huy, Le NNguyen Quoc
 *@version: 1.0
 *@created: 28/08/2024
 */
package iuh.fit.ktpm;

public class Rectangle {
    private double lenght;
    private double width;

    public double getArea() {
        return lenght * width;
    }
    public double getPerimeter() {
        return (lenght + width) * 2;
    }

    public double getLenght() {
        return lenght;
    }
    public double getWidth() {
        return width;
    }

    public Rectangle() {
        lenght = 0;
        width = 0;
    }
    public Rectangle(double lenght, double width) {
        if (lenght<0 || width<0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.lenght = lenght;
        this.width = width;
    }

    public void setLenght(double lenght) {
        if (lenght<0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.lenght = lenght;
    }
    public void setWidth(double width) {
        if (width<0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }
}
