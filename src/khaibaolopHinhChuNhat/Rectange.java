package khaibaolopHinhChuNhat;

public class Rectange {
    private double width,height;
    private String color,result;
    Rectange() {
        this.width = 1;
        this.height = 1;
    }
    public Rectange(double width, double height,String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea() {
        return this.width * this.height;
    }
    public double findPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String Convert() {
        String s = this.color.toLowerCase();
        return String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
    }
    public boolean TestCase() {
        if (this.width <= 0 || this.height <=0) {
            return false;
        }
        return true;
    }
}
